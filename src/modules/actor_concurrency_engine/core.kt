# Core computational routine for Coroutine Actor-Driven State Machine Engine
# Module: actor_concurrency_engine

def compute_actor_concurrency_engine(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
