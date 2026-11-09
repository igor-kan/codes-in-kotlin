# Boundary validation and exceptional input guarding for Kotlin/Native Direct POSIX Shared Memory IPC Buffer
# Module: native_posix_shared_memory

def sanitize_native_posix_shared_memory_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
