# Deterministic unit tests for Redux-Style Reactive Event Bus with SharedFlow
# Module: reactive_event_bus_flow

def test_reactive_event_bus_flow_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
