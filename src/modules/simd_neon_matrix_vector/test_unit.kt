# Deterministic unit tests for Kotlin/Native ARM Neon Matrix-Vector Multiplication
# Module: simd_neon_matrix_vector

def test_simd_neon_matrix_vector_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
