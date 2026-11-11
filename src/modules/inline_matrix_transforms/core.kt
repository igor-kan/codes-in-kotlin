# Core computational routine for Zero-Allocation Inline Value Class 3D Matrix Math
# Module: inline_matrix_transforms

def compute_inline_matrix_transforms(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
