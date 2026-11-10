# Boundary validation and exceptional input guarding for Functional Persistent CHAMP Map with Bitmap Indexing
# Module: persistent_champ_map_kt

def sanitize_persistent_champ_map_kt_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
