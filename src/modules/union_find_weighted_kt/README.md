# Weighted Potential Disjoint Set Union (Relative Difference Constraints) (`union_find_weighted_kt`)

> Category: **Graph & Constraints** | Language: **Kotlin 2.0**

## Overview

Maintains equivalence classes with relative linear potential differences (pot[u] - pot[v] = w) to solve weighted consistency checks and detect contradictory cycles.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(alpha(N)) amortized path-compressed potential find & merge` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- For nodes in same component, diff(u, v) equals exact accumulated weight delta.

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
