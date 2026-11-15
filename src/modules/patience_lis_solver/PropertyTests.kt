package com.igorkan.modules.patience_lis_solver

fun runPropertyTests() {
    val solver = PatienceLisSolver()
    for (seed in 1..20) {
        val arr = IntArray(30) { i -> ((i * 37 + seed * 13) % 29) }
        val res = solver.solveStrictLis(arr)
        verifyLisStrict(arr, res)
        check(res.length == lisLengthQuadraticOracle(arr))
    }
}
