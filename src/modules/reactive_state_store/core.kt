# Core computational routine for Redux-Style Reactive State Container with StateFlow
# Module: reactive_state_store

def compute_reactive_state_store(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
