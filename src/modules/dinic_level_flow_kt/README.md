# Dinic Level-Graph Blocking-Flow Solver in Kotlin (`dinic_level_flow_kt`)

> Category: **Network Flow** | Language: **Kotlin 2.0**

## Overview

Computes maximum s-t network flow using BFS distance layering and current-arc pointer DFS blocking flow.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V^2 * E) BFS level graph + current-arc DFS augmentation` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Total augmented flow equals minimum s-t cut capacity.

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
