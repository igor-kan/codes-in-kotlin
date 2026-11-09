# Core computational routine for Kotlin/Native Direct POSIX Shared Memory IPC Buffer
# Module: native_posix_shared_memory

def compute_native_posix_shared_memory(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
