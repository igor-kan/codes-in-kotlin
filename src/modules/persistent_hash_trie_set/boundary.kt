# Boundary validation and exceptional input guarding for Functional Persistent Hash Array Mapped Trie Set
# Module: persistent_hash_trie_set

def sanitize_persistent_hash_trie_set_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
