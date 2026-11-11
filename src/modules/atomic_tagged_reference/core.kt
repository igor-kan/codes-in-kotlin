# Core computational routine for Lock-Free Atomic Tagged Reference with Version Counter
# Module: atomic_tagged_reference

def compute_atomic_tagged_reference(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
