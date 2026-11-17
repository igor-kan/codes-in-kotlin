# Line-Sweep Closed Interval Union & Coverage Counter (`interval_merge_sweep_kt`)

> Category: **Computational Geometry** | Language: **Kotlin 2.0**

## Overview

Sorts closed [start, end] intervals and sweeps non-overlapping coalesced blocks to compute union spans and gaps.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) sweep line union & covered span` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Output intervals are strictly sorted and non-overlapping.

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
