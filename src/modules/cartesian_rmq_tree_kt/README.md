# Linear-Time Stack Cartesian Tree & Range Minimum Query (`cartesian_rmq_tree_kt`)

> Category: **Trees & RMQ** | Language: **Kotlin 2.0**

## Overview

Builds a min-heap Cartesian tree over an array in O(N) time using a monotonic stack and answers range minimum index queries.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) monotonic right-spine construction + O(H) LCA range minimum` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every node index lies between its left and right subtrees and holds the range minimum.

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
