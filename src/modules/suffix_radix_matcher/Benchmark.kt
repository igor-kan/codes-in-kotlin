package com.igorkan.modules.suffix_radix_matcher

fun runBenchmark() {
    val s = "abcabxabcdabcab".repeat(30)
    val b = RadixSuffixBuilder()
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) sink += countDistinctSubstrings(b.buildIndex(s))
    println("suffix_radix_matcher ns=${(System.nanoTime() - t0) / 100} sink=$sink")
}
