# Boundary validation and exceptional input guarding for Kotlin/Native ARM Neon Vector Dot Product Wrapper
# Module: simd_neon_array_math

def sanitize_simd_neon_array_math_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
