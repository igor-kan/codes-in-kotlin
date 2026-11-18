# 4-Slot 8-Bit Fingerprint Cuckoo Filter in Kotlin (`cuckoo_filter_fp8_kt`)

> Category: **Probabilistic Filters** | Language: **Kotlin 2.0**

## Overview

Stores 8-bit fingerprints in 4-slot buckets using partial-key cuckoo hashing i2 = i1 xor hash(fp) to support constant-time deletion.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) dual-bucket lookup, insert, and delete` |
| **Space Complexity** | `O(B * 4)` |

## Mathematical & Safety Invariants

- Inserted keys always test positive and can be removed cleanly.

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
