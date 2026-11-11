# Boundary validation and exceptional input guarding for Zero-Allocation Inline Value Class 3D Matrix Math
# Module: inline_matrix_transforms

def sanitize_inline_matrix_transforms_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
