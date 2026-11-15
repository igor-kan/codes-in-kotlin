# Persistent-Style Rollback Disjoint Set Union by Size (`disjoint_set_rollback`)

> Category: **Graph Connectivity** | Language: **Kotlin 2.0**

## Overview

Maintains dynamic undirected graph connectivity using union-by-size and an explicit mutation trail allowing arbitrary rollback to any earlier checkpoint in constant work per undone union.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) Find/Union without path compression + O(1) snapshot rollback` |
| **Space Complexity** | `O(N) IntArray parent/size + change stack` |

## Mathematical & Safety Invariants

- Sum of sizes across all root components strictly equals vertex count N.
- Rolling back to checkpoint c restores exact component count and root set.

## Module Architecture

| File | Lifecycle Role |
| :--- | :--- |
| `Types.kt` | Stage 01 |
| `Errors.kt` | Stage 02 |
| `Contract.kt` | Stage 03 |
| `Core.kt` | Stage 04 |
| `Validation.kt` | Stage 05 |
| `FastPath.kt` | Stage 06 |
| `Concurrent.kt` | Stage 07 |
| `Invariants.kt` | Stage 08 |
| `UnitTests.kt` | Stage 09 |
| `PropertyTests.kt` | Stage 10 |
| `Benchmark.kt` | Stage 11 |
| `README.md` | Stage 12 |

## Verification & Execution Example

```text
kotlinc *.kt -include-runtime -d module.jar && java -jar module.jar
```

---
© 2026 Igor Kan
