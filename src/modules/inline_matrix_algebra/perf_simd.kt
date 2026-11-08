# Performance optimizations and vectorization for Zero-Allocation Inline Value Class Matrix Algebra
# Module: inline_matrix_algebra
# - Stride-1 sequential memory access
# - In-place scratchpad reuse to avoid garbage collection pressure
# - Cacheline blocking for problem sizes exceeding L2 capacity
