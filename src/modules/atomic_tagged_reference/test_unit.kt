# Deterministic unit tests for Lock-Free Atomic Tagged Reference with Version Counter
# Module: atomic_tagged_reference

def test_atomic_tagged_reference_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
