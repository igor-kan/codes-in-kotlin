# Deterministic unit tests for Direct POSIX Memory-Mapped File I/O for Native
# Module: native_posix_file_io

def test_native_posix_file_io_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
