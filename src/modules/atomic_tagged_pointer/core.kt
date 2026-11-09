# Core computational routine for Lock-Free Atomic Tagged Pointer with ABA Prevention
# Module: atomic_tagged_pointer

def compute_atomic_tagged_pointer(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
