package com.igorkan.modules.count_min_sketch_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val cms = CountMinSketch(4, 128); repeat(50) { cms.add(42L) }; require(cms.estimate(42L) >= 50L)
    }
}