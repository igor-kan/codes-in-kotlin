# Deterministic unit tests for Zero-Overhead Inline Value Class Complex Vector Math
# Module: inline_complex_vector

def test_inline_complex_vector_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
