# Boundary validation and exceptional input guarding for Hierarchical Supervisor Tree with Auto-Healing Jobs
# Module: supervisor_resilience_tree

def sanitize_supervisor_resilience_tree_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
