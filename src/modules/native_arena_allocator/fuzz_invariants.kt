# Fuzzing and invariant test target for Kotlin/Native Direct Scoped C-Memory Arena
# Module: native_arena_allocator
# Invariant: Output must remain finite for all finite inputs bounded in [-1e6, 1e6]
# Invariant: f(0) == 0 strictly preserved
