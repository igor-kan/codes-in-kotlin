# Prefix-Doubling Suffix Array & Kasai LCP Builder (`suffix_array_lcp_kt`)

> Category: **String Indexing** | Language: **Kotlin 2.0**

## Overview

Constructs lexicographical suffix order arrays and Kasai LCP lengths for binary-search substring frequency queries.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log^2 N) rank doubling + O(N) Kasai LCP` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Suffixes in SA order are strictly increasing.
- lcp[i] matches longest common prefix between adjacent sorted suffixes.

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
