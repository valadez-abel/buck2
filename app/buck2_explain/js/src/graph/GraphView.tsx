/**
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under both the MIT license found in the
 * LICENSE-MIT file in the root directory of this source tree and the Apache
 * License, Version 2.0 found in the LICENSE-APACHE file in the root directory
 * of this source tree.
 */

import React, {useContext} from 'react'
import {DataContext} from '../App'
import {GraphImpl} from './GraphImpl'
import {QueryKey} from '../Router'

export type Node = {
  value: number
  deps: number[]
  rdeps: number[]
  transitiveDeps: number
}

function defaultNode(): Node {
  return {
    value: 0,
    deps: [],
    rdeps: [],
    transitiveDeps: 0,
  }
}

export function GraphView(props: {view: QueryKey}) {
  const {build, allTargets} = useContext(DataContext)
  if (build == null) {
    // TODO: this should show a loading sign
    return null
  }

  // build better data structure
  let nodeMap = new Map<number, Node>()
  for (let i = 0; i < build.targetsLength(); i++) {
    // Create node object
    if (nodeMap.get(i) == null) {
      nodeMap.set(i, {
        ...defaultNode(),
        value: i,
      })
    }
  }

  // Set options
  for (const [k, node] of nodeMap) {
    const target = build.targets(k)!

    for (let i = 0; i < target.depsLength(); i++) {
      const dep = target.deps(i)!
      const d = allTargets[dep]

      // Record deps
      node.deps.push(d)

      // Record rdeps
      if (d === k) {
        throw Error('wth')
      }
      nodeMap.get(d)!.rdeps.push(k)
    }
  }

  // Sum transitive deps. For each node, we traverse all the transitive rdeps
  for (const [k, _] of nodeMap) {
    let visited = new Set()
    let rdeps = new Set(nodeMap.get(k)!.rdeps)
    while (rdeps.size > 0) {
      let next: Set<number> = new Set()
      for (const r of rdeps) {
        if (!visited.has(r)) {
          const rnode = nodeMap.get(r)!
          rnode.transitiveDeps += 1
          visited.add(r)
          for (const r2 of rnode.rdeps) {
            next.add(r2)
          }
        }
      }
      rdeps = next
    }
  }

  let categoriesCounter = new Map()
  for (const [k, node] of nodeMap) {
    const target = build.targets(k)
    const type = target!.type()
    categoriesCounter.set(type, (categoriesCounter.get(type) ?? 0) + 1)
  }

  let categoryOptions: {category: string; count: number; checked: false}[] = []
  for (const [category, count] of categoriesCounter) {
    categoryOptions.push({category, count, checked: false})
  }

  return (
    <GraphImpl
      nodes={nodeMap}
      build={build}
      categoryOptions={categoryOptions}
      allTargets={allTargets}
    />
  )
}
