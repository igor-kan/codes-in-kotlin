# Fault-Tolerant Closed / Open / Half-Open Circuit Breaker FSM (`circuit_breaker_fsm_kt`)

> Category: **Distributed Resilience** | Language: **Kotlin 2.0**

## Overview

Protects downstream RPC clients using a deterministic finite state machine transitioning between Closed, Open cooldown isolation, and Half-Open probe recovery.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(1) state transition & sliding failure threshold check` |
| **Space Complexity** | `O(1)` |

## Mathematical & Safety Invariants

- Calls attempted while state == Open before cooldown elapses are unconditionally rejected.
- Consecutive probe successes in HalfOpen cleanly restore Closed state with reset counters.

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
