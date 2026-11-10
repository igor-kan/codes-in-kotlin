# Boundary validation and exceptional input guarding for Kotlin/Native Lock-Free Queue with Atomic References
# Module: native_atomic_cas_queue

def sanitize_native_atomic_cas_queue_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
