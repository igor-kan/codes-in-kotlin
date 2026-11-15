package com.igorkan.modules.topological_kahn_kt

fun runBenchmark() {
    val edges = (0 until 499).map { it to it + 1 }
    val sorter = KahnDagSorter()
    val t0 = System.nanoTime()
    var sink = 0
    for (it in 0 until 200) sink += sorter.sortLexMin(500, edges).order.size
    println("topological_kahn_kt ns=${(System.nanoTime() - t0) / 200} sink=$sink")
}
