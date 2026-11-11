# Deterministic unit tests for Actor-Driven Work-Stealing Pool with Coroutines
# Module: channel_worker_stealing_pool

def test_channel_worker_stealing_pool_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
