# O(1) Doubly-Linked HashMap LRU Cache in Kotlin (`lru_cache_linked_kt`)

> Category: **Cache & Memory Structures** | Language: **Kotlin 2.0**

## Overview

Implements an O(1) Least Recently Used cache backed by a HashMap index and sentinel-bounded doubly-linked node list in strict null-safe Kotlin.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) get, put, and tail eviction` |
| **Space Complexity** | `O(Capacity)` |

## Mathematical & Safety Invariants

- Live map entry count never exceeds positive capacity.
- Forward head-to-tail walk visits exact reverse of tail-to-head walk.

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
