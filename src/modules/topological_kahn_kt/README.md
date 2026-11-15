# Lexicographical Kahn Topological Sort & DAG Wave Scheduler (`topological_kahn_kt`)

> Category: **Graph Algorithms** | Language: **Kotlin 2.0**

## Overview

Resolves directed dependency graphs deterministically via min-heap Kahn peeling, wave-layer extraction, and cycle participant detection.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V) with PriorityQueue tie-breaking` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- When acyclic, every directed edge u -> v has pos[u] < pos[v].
- On cyclic inputs, isAcyclic == false and order.size < vertexCount.

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
