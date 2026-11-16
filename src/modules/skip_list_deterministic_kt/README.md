# SplitMix64-Seeded Ordered Skip List Dictionary in Kotlin (`skip_list_deterministic_kt`)

> Category: **Ordered Search Structures** | Language: **Kotlin 2.0**

## Overview

Implements a clean null-safe ordered integer map via multi-level linked lanes (MAX_LEVEL = 16) with deterministic SplitMix64 tower heights and ordered [lo, hi] range iteration.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) expected insert, contains, delete & range slice` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Bottom lane forward pointers strictly preserve ascending key order.
- Deleted keys disappear cleanly from both lookup and range slice scans.

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
