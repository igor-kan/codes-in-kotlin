# Stoer-Wagner Global Undirected Min-Cut Solver in Kotlin (`stoer_wagner_mincut_kt`)

> Category: **Graph Cuts** | Language: **Kotlin 2.0**

## Overview

Finds exact global minimum cut across undirected weighted graphs via Stoer-Wagner maximum-adjacency contraction phases.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V^3) maximum-adjacency phase contraction` |
| **Space Complexity** | `O(V^2)` |

## Mathematical & Safety Invariants

- Global minimum cut weight <= minimum vertex weighted degree.

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
