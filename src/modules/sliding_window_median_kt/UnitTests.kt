package com.igorkan.modules.sliding_window_median_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val res = SlidingMedian().compute(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3); require(res[0] == 1.0 && res[2] == -1.0)
    }
}