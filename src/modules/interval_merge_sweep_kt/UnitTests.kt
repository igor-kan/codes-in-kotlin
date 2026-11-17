package com.igorkan.modules.interval_merge_sweep_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val m = IntervalMerger().merge(listOf(longArrayOf(1,4), longArrayOf(3,8), longArrayOf(10,12))); require(m.size == 2 && m[0][1] == 8L)
    }
}