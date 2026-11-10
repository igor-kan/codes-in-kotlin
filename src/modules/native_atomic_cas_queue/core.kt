# Core computational routine for Kotlin/Native Lock-Free Queue with Atomic References
# Module: native_atomic_cas_queue

def compute_native_atomic_cas_queue(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
