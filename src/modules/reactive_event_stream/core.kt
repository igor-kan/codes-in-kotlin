# Core computational routine for SharedFlow-Based Event Stream Bus with Replay
# Module: reactive_event_stream

def compute_reactive_event_stream(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
