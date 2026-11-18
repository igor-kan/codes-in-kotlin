# Vose O(1) Alias Table Discrete Categorical Sampler in Kotlin (`vose_alias_sampler_kt`)

> Category: **Randomized Algorithms** | Language: **Kotlin 2.0**

## Overview

Constructs Vose's O(1) Alias Table from arbitrary unnormalized weights using small/large worklists.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) table construction + O(1) bucket draw` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every bucket mixes at most two outcomes and conserves exact categorical probabilities.

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
