# Core computational routine for Direct POSIX Memory-Mapped File I/O for Native
# Module: native_posix_file_io

def compute_native_posix_file_io(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
