# Knuth-Morris-Pratt Failure-Function Pattern Scanner in Kotlin (`kmp_prefix_automaton_kt`)

> Category: **String Matching** | Language: **Kotlin 2.0**

## Overview

Computes KMP longest proper prefix-suffix pi[] table in O(M) and emits all exact occurrence offsets in O(N).

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N + M) zero-backtrack prefix-function scan` |
| **Space Complexity** | `O(M)` |

## Mathematical & Safety Invariants

- Every emitted start offset satisfies exact substring match cleanly.

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
