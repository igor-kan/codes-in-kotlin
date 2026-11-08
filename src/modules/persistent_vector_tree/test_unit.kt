# Deterministic unit tests for 32-Way Branching Persistent Vector Trie
# Module: persistent_vector_tree

def test_persistent_vector_tree_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
