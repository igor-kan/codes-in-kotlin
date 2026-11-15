package com.igorkan.modules.patience_lis_solver

interface LisSolver {
    fun solveStrictLis(nums: IntArray): LisResult
    fun solveLengthOnly(nums: IntArray): Int {
        return solveStrictLis(nums).length
    }
}
