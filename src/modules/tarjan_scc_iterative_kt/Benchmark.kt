package com.igorkan.modules.tarjan_scc_iterative_kt

fun runTarjanSccIterativeKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val es = (0 until 128).map { DiEdge(it, (it + 1) % 128) }; sink += IterativeTarjanScc().decompose(128, es).componentCount
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("tarjan_scc_iterative_kt ns=$ns sink=$sink")
}
