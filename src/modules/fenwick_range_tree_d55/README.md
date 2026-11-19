# Binary-Lifted Fenwick Tree K-th Order Statistic in Kotlin (`fenwick_range_tree_d55`)

> Category: **Order-Statistic Structures** | Language: **Kotlin 2.0**

## Overview

Supports O(log N) point increments and binary-lifted K-th smallest frequency lookup without dynamic tree allocations.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) BIT update, prefix sum, and K-th lookup` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- K-th order lookup matches exact sorted index over multiset frequencies.

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
