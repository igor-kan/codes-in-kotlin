package com.igorkan.modules.patience_lis_solver

fun runUnitTests() {
    val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    val res = PatienceLisSolver().solveStrictLis(nums)
    verifyLisStrict(nums, res)
    check(res.length == 4)
    check(res.length == lisLengthQuadraticOracle(nums))
}
