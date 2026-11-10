# Boundary validation and exceptional input guarding for Resilient Actor Pipeline with Supervision Strategies
# Module: channel_actor_supervisor

def sanitize_channel_actor_supervisor_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
