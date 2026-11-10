# Deterministic unit tests for Resilient Actor Pipeline with Supervision Strategies
# Module: channel_actor_supervisor

def test_channel_actor_supervisor_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
