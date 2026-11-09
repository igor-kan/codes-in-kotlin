# Core computational routine for Zero-Allocation Inline Value Class Quaternion Algebra
# Module: inline_quaternion_math

def compute_inline_quaternion_math(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
