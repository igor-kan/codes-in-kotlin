package com.igorkan.modules.levenshtein_myers_bitvec

fun runPropertyTests() {
    val words = listOf("banana", "ananas", "bandana", "abacab", "cababa")
    for (w1 in words) for (w2 in words) {
        verifyMyersEqualsOracle(w1, w2)
        check(MyersBitVecDistance().editDistance(w1, w2) == MyersBitVecDistance().editDistance(w2, w1))
    }
}
