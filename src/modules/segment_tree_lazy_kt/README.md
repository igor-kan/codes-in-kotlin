# Lazy-Propagation Range-Add & Range-Min LongArray Segment Tree (`segment_tree_lazy_kt`)

> Category: **Range Query Structures** | Language: **Kotlin 2.0**

## Overview

Implements a flat primitive LongArray segment tree supporting O(log N) lazy interval addition updates and range minimum queries without JVM node-object boxing overhead.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) build, O(log N) rangeAdd and rangeMin` |
| **Space Complexity** | `O(4 * N) LongArray storage` |

## Mathematical & Safety Invariants

- Pushdown preserves exact sum and min semantics across left and right halves.
- Every queryRange(l, r) equals exact naive slice minimum across arbitrary mixed updates.

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
