# Dual-TreeMap Sliding Window Exact Median Tracker (`sliding_window_median_kt`)

> Category: **Streaming Analytics** | Language: **Kotlin 2.0**

## Overview

Maintains sorted frequency maps for lower and upper halves across fixed-width K sliding windows to emit exact double medians.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log K) balanced window partition medians` |
| **Space Complexity** | `O(K)` |

## Mathematical & Safety Invariants

- Lower half size matches upper or upper + 1 throughout window shifts.

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
