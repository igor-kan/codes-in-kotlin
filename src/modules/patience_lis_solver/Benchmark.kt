package com.igorkan.modules.patience_lis_solver

fun runBenchmark() {
    val arr = IntArray(4096) { i -> (i * 2654435761L % 10000).toInt() }
    val solver = PatienceLisSolver()
    val t0 = System.nanoTime()
    var sink = 0
    for (it in 0 until 200) sink += solver.solveStrictLis(arr).length
    println("patience_lis_solver ns=${(System.nanoTime() - t0) / 200} sink=$sink")
}
