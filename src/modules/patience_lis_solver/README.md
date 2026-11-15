# O(N log N) Patience Sorting Longest Increasing Subsequence (`patience_lis_solver`)

> Category: **Dynamic Programming** | Language: **Kotlin 2.0**

## Overview

Computes longest strictly increasing subsequences using Patience Sorting binary search on active pile tails combined with backpointer chains for full O(N log N) sequence reconstruction.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N)` |
| **Space Complexity** | `O(N) tails & predecessor arrays` |

## Mathematical & Safety Invariants

- Reconstructed index chain is strictly ascending and element values are strictly increasing.
- Output length matches quadratic O(N^2) DP oracle identically.

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
