# Core computational routine for Resilient Actor Pipeline with Supervision Strategies
# Module: channel_actor_supervisor

def compute_channel_actor_supervisor(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
