package com.igorkan.modules.patience_lis_solver

fun lisLengthQuadraticOracle(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    val dp = IntArray(nums.size) { 1 }
    var best = 1
    for (i in nums.indices) {
        for (j in 0 until i) if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1
        if (dp[i] > best) best = dp[i]
    }
    return best
}
