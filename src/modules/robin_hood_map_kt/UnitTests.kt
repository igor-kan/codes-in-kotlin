package com.igorkan.modules.robin_hood_map_kt

fun testRobinBasicAndShiftDelete() {
    val m = RobinHoodLongMap(16)
    val oracle = HashMap<Long, Long>()
    for (i in 0 until 60) {
        val k = i.toLong() * 13L
        m.put(k, k * 2L)
        oracle[k] = k * 2L
    }
    for (i in 0 until 60 step 3) {
        val k = i.toLong() * 13L
        requireRobinMap(m.remove(k) == oracle.remove(k)) { "delete mismatch" }
    }
    verifyRobinOracle(m, oracle)
}
