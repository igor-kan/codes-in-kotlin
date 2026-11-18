# Dynamic Li Chao Segment Tree for Lower-Envelope Line Queries (`li_chao_envelope_kt`)

> Category: **Convex Hull Optimization** | Language: **Kotlin 2.0**

## Overview

Stores dominant affine lines y = m*x + b at segment midpoints over [0, X) to answer lower-envelope queries in O(log X).

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log X) line insertion and point minimum query` |
| **Space Complexity** | `O(X)` |

## Mathematical & Safety Invariants

- Point query returns exact min_i (m_i * x + b_i) across all inserted lines.

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
