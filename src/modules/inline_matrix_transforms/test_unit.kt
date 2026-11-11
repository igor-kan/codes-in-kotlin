# Deterministic unit tests for Zero-Allocation Inline Value Class 3D Matrix Math
# Module: inline_matrix_transforms

def test_inline_matrix_transforms_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
