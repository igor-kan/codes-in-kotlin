# Boundary validation and exceptional input guarding for Actor-Driven Work-Stealing Pool with Coroutines
# Module: channel_worker_stealing_pool

def sanitize_channel_worker_stealing_pool_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
