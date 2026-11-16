# Open-Addressed Robin Hood Hash Map with Backward-Shift Deletion (`robin_hood_map_kt`)

> Category: **Hash Tables & Memory Layouts** | Language: **Kotlin 2.0**

## Overview

Implements open-addressed Robin Hood hashing storing keys, values, and probe-sequence-lengths (PSL) in flat LongArrays, stealing slots from richer keys and compacting gaps via backward shift on removal.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) expected insert, get, remove with low PSL variance` |
| **Space Complexity** | `O(Capacity) primitive LongArray parallel arrays` |

## Mathematical & Safety Invariants

- PSL distance of every live slot equals exact circular distance from its home hash bucket.
- Backward-shift delete preserves probe chain reachability without inserting tombstones.

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
