/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under both the MIT license found in the
 * LICENSE-MIT file in the root directory of this source tree and the Apache
 * License, Version 2.0 found in the LICENSE-APACHE file in the root directory
 * of this source tree.
 */

use std::fmt::Arguments;

#[doc(hidden)]
#[cold]
#[track_caller]
pub fn buck2_error_anyhow_impl(tags: &[crate::ErrorTag], args: Arguments) -> anyhow::Error {
    let anyhow_error = anyhow::anyhow!("{args}");
    let error = crate::Error::from(anyhow_error).tag(tags.iter().copied());
    anyhow::Error::from(error)
}

#[doc(hidden)]
#[cold]
#[track_caller]
pub fn internal_error_anyhow_impl(args: Arguments) -> anyhow::Error {
    buck2_error_anyhow_impl(
        &[crate::ErrorTag::InternalError],
        format_args!("{args} (internal error)"),
    )
}

#[macro_export]
macro_rules! buck2_error_anyhow {
    ($tags:expr, $format:expr) => {
        buck2_error_anyhow!($tags, $format,)
    };
    ($tags:expr, $format:expr, $($arg:tt)*) => {
        $crate::macros::buck2_error_anyhow_impl(&$tags, format_args!($format, $($arg)*))
    };
}

#[macro_export]
macro_rules! internal_error_anyhow {
    ($format:expr) => {
        internal_error_anyhow!($format,)
    };
    ($format:expr , $($arg:tt)*) => {
        $crate::macros::internal_error_anyhow_impl(format_args!($format, $($arg)*))
    };
}
