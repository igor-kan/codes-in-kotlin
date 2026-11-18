# Hopcroft-Karp O(E sqrt(V)) Maximum Bipartite Matcher (`hopcroft_karp_match_kt`)

> Category: **Graph Matching** | Language: **Kotlin 2.0**

## Overview

Computes maximum cardinality bipartite matching by finding shortest augmenting path layers via BFS and DFS.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(E * sqrt(V)) layered BFS + vertex-disjoint DFS augmenting paths` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Matched left and right vertices form a valid bijection of maximum cardinality.

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
