# Core computational routine for Backpressure-Regulated Actor Channel Stream Pipeline
# Module: coroutine_channel_pipeline

def compute_coroutine_channel_pipeline(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
