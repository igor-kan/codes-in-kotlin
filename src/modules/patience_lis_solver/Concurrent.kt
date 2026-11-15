package com.igorkan.modules.patience_lis_solver

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun batchSolveLis(arrays: List<IntArray>): List<LisResult> {
    val solver = PatienceLisSolver()
    val pool = Executors.newFixedThreadPool(4)
    return try {
        pool.invokeAll(arrays.map { a -> Callable { solver.solveStrictLis(a) } }).map { it.get() }
    } finally {
        pool.shutdown()
    }
}
