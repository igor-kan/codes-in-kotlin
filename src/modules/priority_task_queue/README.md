# Concurrent Binary Heap Task Queue with Cancellation (`priority_task_queue`)

## Overview

The `priority_task_queue` module provides high-performance, mathematically rigorous operations for `codes-in-kotlin`.

### Component Artifacts

- **Type Definitions**: [`types.kt`](./types.kt)
- **Computational Core**: [`core.kt`](./core.kt)
- **Deterministic Unit Tests**: [`tests.kt`](./tests.kt)
- **SIMD Optimizations**: [`perf_simd.kt`](./perf_simd.kt)
- **Microbenchmarks**: [`benchmarks.kt`](./benchmarks.kt)
- **Boundary Validation**: [`boundary.kt`](./boundary.kt)
- **Property Fuzzing**: [`fuzz_invariants.kt`](./fuzz_invariants.kt)

### Computational Invariant

$$f(x) = x \left(1 + \frac{1}{2}x - \frac{1}{8}x^2\right)$$

Maintained under strict continuous integration, sanitizer checks, and memory bounds verification.
