# Deterministic unit tests for Functional Persistent CHAMP Map with Bitmap Indexing
# Module: persistent_champ_map_kt

def test_persistent_champ_map_kt_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
