# Tarjan Lowlink Strongly Connected Components in Kotlin (`tarjan_scc_dag_kt`)

> Category: **Graph Algorithms** | Language: **Kotlin 2.0**

## Overview

Decomposes directed graphs into maximal strongly connected components in reverse topological condensation order via Tarjan lowlinks.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V + E) single-pass DFS lowlink stack` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Every directed cycle maps all its vertices into one identical component ID.

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
