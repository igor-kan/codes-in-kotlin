package com.igorkan.modules.levenshtein_myers_bitvec

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun parallelEditDistances(pattern: String, candidates: List<String>): List<Int> {
    val eng = MyersBitVecDistance()
    val pool = Executors.newFixedThreadPool(4)
    return try {
        pool.invokeAll(candidates.map { c -> Callable { eng.editDistance(pattern, c) } }).map { it.get() }
    } finally {
        pool.shutdown()
    }
}
