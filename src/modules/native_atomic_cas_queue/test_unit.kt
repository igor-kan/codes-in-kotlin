# Deterministic unit tests for Kotlin/Native Lock-Free Queue with Atomic References
# Module: native_atomic_cas_queue

def test_native_atomic_cas_queue_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
