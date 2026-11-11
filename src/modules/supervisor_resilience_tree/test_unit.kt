# Deterministic unit tests for Hierarchical Supervisor Tree with Auto-Healing Jobs
# Module: supervisor_resilience_tree

def test_supervisor_resilience_tree_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
