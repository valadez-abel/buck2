/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under both the MIT license found in the
 * LICENSE-MIT file in the root directory of this source tree and the Apache
 * License, Version 2.0 found in the LICENSE-APACHE file in the root directory
 * of this source tree.
 */

use buck2_core::is_open_source;
use buck2_interpreter_for_build::interpreter::testing::Tester;
use indoc::indoc;

#[test]
fn test_select_funcs() {
    let mut tester = Tester::new().unwrap();
    tester
        .run_starlark_test(indoc!(
            // This is from //xplat/build_infra/buck_client/test/com/facebook/buck/parser/testdata/select_introspection/defs.bzl
            r#"
def _map_func(value):
    if type(value) == type(""):
        if "TEST" in value:
            return value.replace("TEST", "replaced")
    elif type(value) == type([]):
        return [v for v in value if v != "INVALID"]
    elif type(value) == type({}):
        return {k: v for k, v in value.items() if "win" in v}
    return value

def _test_func(value):
    return "TEST" in value

def _assert_eq(expected, actual):
    if type(expected) == type(select({"DEFAULT": []})):
        result = select_equal_internal(expected, actual)
    else:
        result = expected == actual

    if not result:
        fail("expected %s but got %s" % (expected, actual))

def _test_single_config_str():
    str_select = select({"config/windows:x86_64": "flag_TEST"})

    _assert_eq(
        select({"config/windows:x86_64": "flag_replaced"}),
        select_map(str_select, _map_func),
    )
    _assert_eq(True, select_test(str_select, _test_func))

def _test_single_config_list():
    list_select = select({"config/windows:x86_64": ["flag", "INVALID"]})

    _assert_eq(
        select({"config/windows:x86_64": ["flag"]}),
        select_map(list_select, _map_func),
    )
    _assert_eq(False, select_test(list_select, _test_func))

def _test_single_config_dict():
    dict_select = select({
        "config/windows:x86_64": {"test.h": "windows/test.h", "test_apple.h": "apple/test.h"},
    })

    _assert_eq(
        select({"config/windows:x86_64": {"test.h": "windows/test.h"}}),
        select_map(dict_select, _map_func),
    )
    _assert_eq(False, select_test(dict_select, _test_func))

def _test_multi_config():
    multi_select = select({
        "DEFAULT": ["-DBASE", "TEST"],
        "config//android:base": ["-DANDROID"],
        "config//iphoneos:base": ["INVALID", "-DIPHONE"],
        "config//windows:base": ["TEST"],
    })

    _assert_eq(
        select({
            "DEFAULT": ["-DBASE", "TEST"],
            "config//android:base": ["-DANDROID"],
            "config//iphoneos:base": ["-DIPHONE"],
            "config//windows:base": ["TEST"],
        }),
        select_map(multi_select, _map_func),
    )
    _assert_eq(True, select_test(multi_select, _test_func))

def _test_concatenated_native():
    expr_select = ["INVALID"] + ["TEST"] + select({"config/windows:x86_64": ["-DWINDOWS"]})

    _assert_eq(
        [] + ["TEST"] + select({"config/windows:x86_64": ["-DWINDOWS"]}),
        select_map(expr_select, _map_func),
    )
    _assert_eq(True, select_test(expr_select, _test_func))

def _test_concatenated_nested():
    expr_select = ["TEST"] + select({"config/windows:x86_64": ["-DWINDOWS", "INVALID"]})

    _assert_eq(
        ["TEST"] + select({"config/windows:x86_64": ["-DWINDOWS"]}),
        select_map(expr_select, _map_func),
    )
    _assert_eq(True, select_test(expr_select, _test_func))

def test():
    _test_single_config_str()
    _test_single_config_list()
    _test_single_config_dict()
    _test_multi_config()
    _test_concatenated_native()
    _test_concatenated_nested()
    "#
        ))
        .unwrap();
}

#[test]
fn test_failing_select_funcs() {
    let mut tester = Tester::new().unwrap();
    assert!(
        tester
            .run_starlark_test(indoc!(
                r#"
def test():
    # bitwise or fails
    expr_select = {} | select({"config/windows:x86_64": {}})
    "#
            ))
            .is_err()
    );
}

#[test]
#[should_panic]
fn test_failing_nested_select() {
    let mut tester = Tester::new().unwrap();
    let test = indoc!(
        r#"
def _test_func(value):
    return "TEST" in value

def test():
    expr_select = select_test(select(select({"config/windows:x86_64": "flag_TEST"})), _test_func)
    "#
    );
    if is_open_source() {
        // soft errors are hard errors in oss
        assert!(
            tester
                .run_starlark_test(test)
                .is_err_and(|e| e.to_string().contains("select_not_dict"))
        );
    } else {
        // TODO: nested select panics, to be fixed.
        let _panic = tester.run_starlark_test(test);
    }
}
