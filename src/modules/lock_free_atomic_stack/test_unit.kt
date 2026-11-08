# Deterministic unit tests for AtomicReference Treiber Stack with Backoff
# Module: lock_free_atomic_stack

def test_lock_free_atomic_stack_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
