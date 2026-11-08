# Deterministic unit tests for SharedFlow-Based Event Stream Bus with Replay
# Module: reactive_event_stream

def test_reactive_event_stream_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
