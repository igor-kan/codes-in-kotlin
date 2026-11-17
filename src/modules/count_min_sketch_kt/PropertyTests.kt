package com.igorkan.modules.count_min_sketch_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val cms = CountMinSketch(4, 64); repeat(20) { cms.add(it.toLong()) }; require(cms.estimate(5L) >= 1L)
    }
}