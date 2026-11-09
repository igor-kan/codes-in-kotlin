# Core computational routine for Kotlin/Native ARM Neon Vector Dot Product Wrapper
# Module: simd_neon_array_math

def compute_simd_neon_array_math(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
