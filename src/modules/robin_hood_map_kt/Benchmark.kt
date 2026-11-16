package com.igorkan.modules.robin_hood_map_kt

fun runRobinHoodMapKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val m = RobinHoodLongMap(512); for(k in 0L until 256L) m.put(k, k); sink += (m.get((it % 256).toLong()) ?: 0L)
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("robin_hood_map_kt ns=$ns sink=$sink")
}
