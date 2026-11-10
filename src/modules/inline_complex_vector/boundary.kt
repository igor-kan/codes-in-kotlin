# Boundary validation and exceptional input guarding for Zero-Overhead Inline Value Class Complex Vector Math
# Module: inline_complex_vector

def sanitize_inline_complex_vector_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
