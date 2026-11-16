# Non-Recursive Explicit-Stack Tarjan SCC Solver in Kotlin (`tarjan_scc_iterative_kt`)

> Category: **Graph Algorithms** | Language: **Kotlin 2.0**

## Overview

Decomposes directed graphs into Strongly Connected Components and condensation DAG indices using explicit IntArray call frames, eliminating JVM CallStack overflow on deep linear chains.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V + E) iterative stack safe` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Every directed edge (u -> v) satisfies compId[u] == compId[v] or compId[u] > compId[v].
- Every strongly connected cycle collapses to a unique shared component ID.

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
