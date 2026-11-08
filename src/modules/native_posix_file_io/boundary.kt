# Boundary validation and exceptional input guarding for Direct POSIX Memory-Mapped File I/O for Native
# Module: native_posix_file_io

def sanitize_native_posix_file_io_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
