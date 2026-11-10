# Core computational routine for Functional Persistent CHAMP Map with Bitmap Indexing
# Module: persistent_champ_map_kt

def compute_persistent_champ_map_kt(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
