package com.igorkan.modules.trie_aho_corasick_kt

fun runBenchmark() {
    val ac = AhoCorasickMatcher(listOf("alpha", "beta", "gamma", "delta"))
    val text = "alpha_beta_gamma_delta_".repeat(100)
    val t0 = System.nanoTime()
    var sink = 0
    for (i in 0 until 500) sink += countHitsFast(ac, text)
    println("trie_aho_corasick_kt ns=${(System.nanoTime() - t0) / 500} sink=$sink")
}
