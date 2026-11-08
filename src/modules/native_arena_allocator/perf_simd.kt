# Performance optimizations and vectorization for Kotlin/Native Direct Scoped C-Memory Arena
# Module: native_arena_allocator
# - Stride-1 sequential memory access
# - In-place scratchpad reuse to avoid garbage collection pressure
# - Cacheline blocking for problem sizes exceeding L2 capacity
