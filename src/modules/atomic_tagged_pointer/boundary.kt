# Boundary validation and exceptional input guarding for Lock-Free Atomic Tagged Pointer with ABA Prevention
# Module: atomic_tagged_pointer

def sanitize_atomic_tagged_pointer_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
