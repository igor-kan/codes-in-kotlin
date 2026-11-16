package com.igorkan.modules.skip_list_deterministic_kt

fun runSkipListDeterministicKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val sl = DeterministicSkipList(); for(i in 0L until 64L) sl.put(i, i); sink += (sl.get((it % 64).toLong()) ?: 0L)
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("skip_list_deterministic_kt ns=$ns sink=$sink")
}
