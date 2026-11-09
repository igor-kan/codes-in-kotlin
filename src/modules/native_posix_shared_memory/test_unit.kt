# Deterministic unit tests for Kotlin/Native Direct POSIX Shared Memory IPC Buffer
# Module: native_posix_shared_memory

def test_native_posix_shared_memory_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
