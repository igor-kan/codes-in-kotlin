package com.igorkan.modules.robin_hood_map_kt

fun verifyRobinOracle(map: RobinHoodLongMap, oracle: Map<Long, Long>) {
    requireRobinMap(map.size() == oracle.size) { "size mismatch" }
    for ((k, v) in oracle) {
        requireRobinMap(map.get(k) == v) { "missing or wrong value for key=$k" }
    }
}
