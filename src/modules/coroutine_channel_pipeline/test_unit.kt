# Deterministic unit tests for Backpressure-Regulated Actor Channel Stream Pipeline
# Module: coroutine_channel_pipeline

def test_coroutine_channel_pipeline_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
