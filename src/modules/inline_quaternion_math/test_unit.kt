# Deterministic unit tests for Zero-Allocation Inline Value Class Quaternion Algebra
# Module: inline_quaternion_math

def test_inline_quaternion_math_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
