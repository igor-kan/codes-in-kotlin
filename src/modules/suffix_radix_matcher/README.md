# O(N log N) Radix-Doubling Suffix Array & Kasai LCP Engine (`suffix_radix_matcher`)

> Category: **String Indexing** | Language: **Kotlin 2.0**

## Overview

Builds full suffix arrays using radix counting-sort prefix doubling followed by Kasai's linear-time LCP pass, supporting O(M log N) pattern occurrence counting.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) Suffix Array + O(N) Kasai LCP` |
| **Space Complexity** | `O(N) IntArrays` |

## Mathematical & Safety Invariants

- Suffixes ordered by suffixArray[0..N-1] are strictly sorted lexicographically.
- Kasai LCP[i] matches exact shared prefix length between sa[i] and sa[i-1].

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
