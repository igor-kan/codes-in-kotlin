# Conservative-Update Count-Min Frequency Sketch (`count_min_sketch_kt`)

> Category: **Probabilistic Structures** | Language: **Kotlin 2.0**

## Overview

Implements conservative-update Count-Min Sketch estimation using splitmix64 row projections so estimates strictly dominate true item counts.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(D) hash table lookup/increment` |
| **Space Complexity** | `O(D * W)` |

## Mathematical & Safety Invariants

- Estimated frequency never underestimates true multiplicity.

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
