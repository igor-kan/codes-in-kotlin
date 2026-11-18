# Knuth-Yao Quadrangle-Inequality Optimal Binary Search Tree DP (`knuth_yao_obst_dp_kt`)

> Category: **Dynamic Programming Optimization** | Language: **Kotlin 2.0**

## Overview

Uses Knuth's root monotonicity opt[i][j-1] <= opt[i][j] <= opt[i+1][j] to compute optimal binary search tree cost in O(N^2).

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N^2) monotonic root-table interval DP` |
| **Space Complexity** | `O(N^2)` |

## Mathematical & Safety Invariants

- Optimal cost matches cubic interval DP minimum.

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
