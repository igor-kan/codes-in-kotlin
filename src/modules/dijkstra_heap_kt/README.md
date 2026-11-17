# Priority-Queue Dijkstra Shortest Paths with Parent Reconstruction (`dijkstra_heap_kt`)

> Category: **Shortest Paths** | Language: **Kotlin 2.0**

## Overview

Computes non-negative edge weight single-source shortest path distances and predecessor pointers via binary min-heap.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V) lazy-deletion min-heap relaxation` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- All relaxed edges satisfy dist[v] <= dist[u] + w.

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
