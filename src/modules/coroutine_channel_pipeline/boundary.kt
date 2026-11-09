# Boundary validation and exceptional input guarding for Backpressure-Regulated Actor Channel Stream Pipeline
# Module: coroutine_channel_pipeline

def sanitize_coroutine_channel_pipeline_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
