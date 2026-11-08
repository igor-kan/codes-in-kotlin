# Boundary validation and exceptional input guarding for AtomicReference Treiber Stack with Backoff
# Module: lock_free_atomic_stack

def sanitize_lock_free_atomic_stack_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
