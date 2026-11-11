# Deterministic unit tests for Kotlin/Native Direct POSIX Mapped File Ring Queue
# Module: native_posix_mapped_queue

def test_native_posix_mapped_queue_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
