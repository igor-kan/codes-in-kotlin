# Boundary validation and exceptional input guarding for SharedFlow-Based Event Stream Bus with Replay
# Module: reactive_event_stream

def sanitize_reactive_event_stream_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
