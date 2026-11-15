package com.igorkan.modules.levenshtein_myers_bitvec

fun runBenchmark() {
    val eng = MyersBitVecDistance()
    val t0 = System.nanoTime()
    var sink = 0
    for (i in 0 until 50000) sink += eng.editDistance("distributed_consensus_raft", "dist_consensus_paxos")
    println("levenshtein_myers_bitvec ns=${(System.nanoTime() - t0) / 50000} sink=$sink")
}
