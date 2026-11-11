# Boundary validation and exceptional input guarding for Redux-Style Reactive Event Bus with SharedFlow
# Module: reactive_event_bus_flow

def sanitize_reactive_event_bus_flow_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
