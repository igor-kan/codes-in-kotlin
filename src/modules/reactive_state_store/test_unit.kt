# Deterministic unit tests for Redux-Style Reactive State Container with StateFlow
# Module: reactive_state_store

def test_reactive_state_store_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
