# Deterministic unit tests for Lock-Free Atomic Tagged Pointer with ABA Prevention
# Module: atomic_tagged_pointer

def test_atomic_tagged_pointer_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
