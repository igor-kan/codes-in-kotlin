# Core computational routine for Hierarchical Supervisor Tree with Auto-Healing Jobs
# Module: supervisor_resilience_tree

def compute_supervisor_resilience_tree(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
