# Strict O(1) Frequency-Bucket LFU Cache (`lfu_o1_cache_kt`)

> Category: **Cache Eviction** | Language: **Kotlin 2.0**

## Overview

Maintains an O(1) key-to-node map paired with per-frequency LinkedHashSet buckets tracking minFreq for exact LFU eviction with FIFO/LRU tie-breaking.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) get, put, and least-frequent LRU eviction` |
| **Space Complexity** | `O(Capacity)` |

## Mathematical & Safety Invariants

- Cache size never exceeds capacity and frequency buckets remain consistent.

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
