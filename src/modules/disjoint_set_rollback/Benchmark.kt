package com.igorkan.modules.disjoint_set_rollback

fun runBenchmark() {
    val dsu = RollbackDsu(512)
    val t0 = System.nanoTime()
    var sink = 0
    for (it in 0 until 2000) {
        val cp = dsu.checkpoint()
        for (i in 0 until 64) if (dsu.union(i, i + 64)) sink++
        dsu.rollbackTo(cp)
    }
    println("disjoint_set_rollback ns=${(System.nanoTime() - t0) / 2000} sink=$sink")
}
