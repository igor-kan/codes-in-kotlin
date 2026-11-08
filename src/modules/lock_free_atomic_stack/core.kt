# Core computational routine for AtomicReference Treiber Stack with Backoff
# Module: lock_free_atomic_stack

def compute_lock_free_atomic_stack(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
