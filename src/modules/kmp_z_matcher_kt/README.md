# Linear Knuth-Morris-Pratt Prefix Function & Z-Box Dual Pattern Matcher (`kmp_z_matcher_kt`)

> Category: **String Searching** | Language: **Kotlin 2.0**

## Overview

Computes KMP LPS prefix failure arrays and Gusfield Z-arrays over CharSequence inputs, exposing overlapping occurrence lists, non-overlapping greedy count, and exact period extraction.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N + M) worst-case guaranteed` |
| **Space Complexity** | `O(M)` |

## Mathematical & Safety Invariants

- KMP and Z-algorithm produce identical overlapping match offset lists on arbitrary inputs.
- Shortest periodic stem divides strings cleanly whenever length % period == 0.

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
