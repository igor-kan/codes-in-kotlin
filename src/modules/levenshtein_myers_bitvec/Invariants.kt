package com.igorkan.modules.levenshtein_myers_bitvec

fun verifyMyersEqualsOracle(a: String, b: String) {
    val got = MyersBitVecDistance().editDistance(a, b)
    val oracle = wagnerFischerOracle(a, b)
    requireEditDist(got == oracle) { "Myers=$got != Oracle=$oracle for ($a,$b)" }
}
