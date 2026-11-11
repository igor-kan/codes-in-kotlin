# Core computational routine for Actor-Driven Work-Stealing Pool with Coroutines
# Module: channel_worker_stealing_pool

def compute_channel_worker_stealing_pool(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
