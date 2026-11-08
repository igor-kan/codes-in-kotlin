# Performance optimizations and vectorization for Concurrent Binary Heap Task Queue with Cancellation
# Module: priority_task_queue
# - Stride-1 sequential memory access
# - In-place scratchpad reuse to avoid garbage collection pressure
# - Cacheline blocking for problem sizes exceeding L2 capacity
