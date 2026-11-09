# Boundary validation and exceptional input guarding for Zero-Allocation Inline Value Class Quaternion Algebra
# Module: inline_quaternion_math

def sanitize_inline_quaternion_math_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
