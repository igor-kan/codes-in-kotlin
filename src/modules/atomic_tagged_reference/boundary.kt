# Boundary validation and exceptional input guarding for Lock-Free Atomic Tagged Reference with Version Counter
# Module: atomic_tagged_reference

def sanitize_atomic_tagged_reference_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
