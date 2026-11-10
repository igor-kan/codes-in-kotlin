# Boundary validation and exceptional input guarding for Structured StateFlow Data Transformation Pipeline
# Module: reactive_state_pipeline

def sanitize_reactive_state_pipeline_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
