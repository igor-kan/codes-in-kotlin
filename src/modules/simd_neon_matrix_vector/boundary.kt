# Boundary validation and exceptional input guarding for Kotlin/Native ARM Neon Matrix-Vector Multiplication
# Module: simd_neon_matrix_vector

def sanitize_simd_neon_matrix_vector_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
