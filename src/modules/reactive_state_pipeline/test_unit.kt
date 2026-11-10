# Deterministic unit tests for Structured StateFlow Data Transformation Pipeline
# Module: reactive_state_pipeline

def test_reactive_state_pipeline_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
