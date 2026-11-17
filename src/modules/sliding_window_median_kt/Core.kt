package com.igorkan.modules.sliding_window_median_kt

class SlidingMedian {
    fun compute(nums: IntArray, k: Int): DoubleArray {
        val n = nums.size
        val out = DoubleArray(n - k + 1)
        val win = nums.copyOf()
        for (i in 0..n - k) {
            val sub = win.sliceArray(i until i + k).also { it.sort() }
            out[i] = if (k % 2 == 1) sub[k / 2].toDouble() else (sub[k / 2 - 1].toDouble() + sub[k / 2]) * 0.5
        }
        return out
    }
}