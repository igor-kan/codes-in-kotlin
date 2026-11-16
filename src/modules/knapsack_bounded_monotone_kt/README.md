# Bounded Knapsack Sliding-Window Monotonic Deque Optimizer (`knapsack_bounded_monotone_kt`)

> Category: **Dynamic Programming Optimizations** | Language: **Kotlin 2.0**

## Overview

Solves bounded multi-quantity knapsack instances in exact O(N * W) time per capacity W by partitioning weights modulo w_i and maintaining an O(1)-amortized sliding window maximum deque.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N * W) independent of item multiplicity` |
| **Space Complexity** | `O(W)` |

## Mathematical & Safety Invariants

- O(N * W) monotonic-deque optimal profit matches naive unrolled O(N * W * Count) DP oracle identically.
- Rejects negative item weights or negative capacity via InvalidArgument exception.

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
