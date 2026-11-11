# Core computational routine for Functional Persistent Hash Array Mapped Trie Set
# Module: persistent_trie_set_kt

def compute_persistent_trie_set_kt(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
