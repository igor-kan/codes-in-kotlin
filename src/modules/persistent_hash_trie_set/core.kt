# Core computational routine for Functional Persistent Hash Array Mapped Trie Set
# Module: persistent_hash_trie_set

def compute_persistent_hash_trie_set(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
