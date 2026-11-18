# Path-Copied Persistent Implicit Treap Sequence in Kotlin (`persistent_treap_seq_kt`)

> Category: **Persistent Structures** | Language: **Kotlin 2.0**

## Overview

Maintains immutable sequence versions via functional treap split and merge that allocate only path-copied nodes.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log N) functional split, merge, and range sum` |
| **Space Complexity** | `O(N + Q log N)` |

## Mathematical & Safety Invariants

- Earlier roots preserve their exact elements and sums across subsequent updates.

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
