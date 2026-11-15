# Myers Bit-Parallel Levenshtein Edit Distance (Long Word Automaton) (`levenshtein_myers_bitvec`)

> Category: **String Matching** | Language: **Kotlin 2.0**

## Overview

Computes exact Levenshtein edit distance using Myers 1999 64-bit word-parallel delta encoding (VP/VN vertical positive/negative vectors), dramatically accelerating sequence comparison.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(M * ceil(N / 64)) bit-vector parallelism` |
| **Space Complexity** | `O(Sigma) 64-bit pattern bitmasks` |

## Mathematical & Safety Invariants

- Symmetry holds: dist(a, b) == dist(b, a) for all sequences <= 63 chars.
- Distance matches exact Wagner-Fischer O(N * M) quadratic DP table everywhere.

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
