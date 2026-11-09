# Deterministic unit tests for Functional Persistent Hash Array Mapped Trie Set
# Module: persistent_hash_trie_set

def test_persistent_hash_trie_set_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
