# Linear-Time Manacher Longest Palindrome Radius Engine (`manacher_palindrome_kt`)

> Category: **String Algorithms** | Language: **Kotlin 2.0**

## Overview

Computes exact palindrome radii at all character and boundary centers in O(N) time and counts total palindromic substrings.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) mirror-accelerated palindrome radius calculation` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Longest reported slice is strictly palindromic and maximal.

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
