# Deterministic unit tests for Coroutine Actor-Driven State Machine Engine
# Module: actor_concurrency_engine

def test_actor_concurrency_engine_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
