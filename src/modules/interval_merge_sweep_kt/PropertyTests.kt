package com.igorkan.modules.interval_merge_sweep_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val m = IntervalMerger().merge(listOf(longArrayOf(1,5), longArrayOf(6,10))); require(m.size == 1 && m[0][1] == 10L)
    }
}