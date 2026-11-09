# Core computational routine for Fault-Tolerant Structured Supervisor Job Hierarchy
# Module: supervisor_worker_tree

def compute_supervisor_worker_tree(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
