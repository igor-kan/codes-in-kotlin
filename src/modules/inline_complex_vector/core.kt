# Core computational routine for Zero-Overhead Inline Value Class Complex Vector Math
# Module: inline_complex_vector

def compute_inline_complex_vector(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
