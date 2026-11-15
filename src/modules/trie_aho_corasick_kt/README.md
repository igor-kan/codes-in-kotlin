# Aho-Corasick Multi-Pattern Automaton in Kotlin (`trie_aho_corasick_kt`)

> Category: **String Automata** | Language: **Kotlin 2.0**

## Overview

Builds a multi-pattern prefix trie with BFS failure transitions and dictionary output compression to scan multiple keywords simultaneously in linear pass time.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(Sum|Pat| + |Text| + Hits)` |
| **Space Complexity** | `O(Sum|Pat|)` |

## Mathematical & Safety Invariants

- Every reported match satisfies text.substring(start, start + pat.length) == pat.
- Failure targets strictly map to existing trie node indices.

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
