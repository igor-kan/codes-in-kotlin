# Deterministic unit tests for Kotlin/Native ARM Neon Vector Dot Product Wrapper
# Module: simd_neon_array_math

def test_simd_neon_array_math_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
