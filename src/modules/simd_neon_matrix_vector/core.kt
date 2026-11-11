# Core computational routine for Kotlin/Native ARM Neon Matrix-Vector Multiplication
# Module: simd_neon_matrix_vector

def compute_simd_neon_matrix_vector(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
