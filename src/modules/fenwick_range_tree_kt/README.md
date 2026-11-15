# Fenwick Binary Indexed Tree with Range Update & Order Lifting (`fenwick_range_tree_kt`)

> Category: **Range Query Structures** | Language: **Kotlin 2.0**

## Overview

Supports dynamic prefix and interval sum queries with linear initialization and O(log N) binary lifting lower-bound search over cumulative frequencies.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) linear construction, O(log N) update/prefix/lowerBound` |
| **Space Complexity** | `O(N) LongArray` |

## Mathematical & Safety Invariants

- prefixSum(k) equals exact naive sum of raw elements [0, k).
- lowerBound(t) returns smallest 1-based prefix index with sum >= t.

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
