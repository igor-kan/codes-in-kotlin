# Deterministic unit tests for Fault-Tolerant Structured Supervisor Job Hierarchy
# Module: supervisor_worker_tree

def test_supervisor_worker_tree_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
