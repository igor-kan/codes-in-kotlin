package com.igorkan.modules.patience_lis_solver

class PatienceLisSolver : LisSolver {
    override fun solveStrictLis(nums: IntArray): LisResult {
        val n = nums.size
        if (n == 0) return LisResult(0, IntArray(0), IntArray(0))
        val tailIndices = IntArray(n)
        val prevIndex = IntArray(n) { -1 }
        var len = 0
        for (i in 0 until n) {
            var lo = 0
            var hi = len
            while (lo < hi) {
                val mid = (lo + hi) ushr 1
                if (nums[tailIndices[mid]] < nums[i]) lo = mid + 1 else hi = mid
            }
            if (lo > 0) prevIndex[i] = tailIndices[lo - 1]
            tailIndices[lo] = i
            if (lo == len) len++
        }
        val resIdx = IntArray(len)
        val resVal = IntArray(len)
        var cur = tailIndices[len - 1]
        for (k in len - 1 downTo 0) {
            resIdx[k] = cur
            resVal[k] = nums[cur]
            cur = prevIndex[cur]
        }
        return LisResult(len, resVal, resIdx)
    }
}
