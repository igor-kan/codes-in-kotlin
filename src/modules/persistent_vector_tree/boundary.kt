# Boundary validation and exceptional input guarding for 32-Way Branching Persistent Vector Trie
# Module: persistent_vector_tree

def sanitize_persistent_vector_tree_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
