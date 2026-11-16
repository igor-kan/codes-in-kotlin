package com.igorkan.modules.kmp_z_matcher_kt

fun runKmpZMatcherKtBench() {
    val t0 = System.nanoTime()
    var sink = 0L
    for (it in 0 until 100) {
        val m = DualStringMatcher(); val txt = "abcabcabab".repeat(64); sink += m.findAllOffsets(txt, "abcab").size
    }
    val ns = (System.nanoTime() - t0) / 100L
    println("kmp_z_matcher_kt ns=$ns sink=$sink")
}
