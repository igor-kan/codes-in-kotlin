# Boundary validation and exceptional input guarding for Coroutine Actor-Driven State Machine Engine
# Module: actor_concurrency_engine

def sanitize_actor_concurrency_engine_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
