package com.igorkan.modules.sliding_window_median_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val res = SlidingMedian().compute(intArrayOf(2, 4, 6, 8), 2); require(res[0] == 3.0 && res[2] == 7.0)
    }
}