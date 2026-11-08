# Core computational routine for 32-Way Branching Persistent Vector Trie
# Module: persistent_vector_tree

def compute_persistent_vector_tree(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
