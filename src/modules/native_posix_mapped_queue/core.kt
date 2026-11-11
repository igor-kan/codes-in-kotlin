# Core computational routine for Kotlin/Native Direct POSIX Mapped File Ring Queue
# Module: native_posix_mapped_queue

def compute_native_posix_mapped_queue(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
