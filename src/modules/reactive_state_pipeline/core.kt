# Core computational routine for Structured StateFlow Data Transformation Pipeline
# Module: reactive_state_pipeline

def compute_reactive_state_pipeline(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
