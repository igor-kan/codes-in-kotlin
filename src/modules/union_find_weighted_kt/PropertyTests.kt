package com.igorkan.modules.union_find_weighted_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val out = Concurrent.parallelVerify(4, listOf(listOf(Triple(0,1,3L), Triple(1,2,4L), Triple(0,2,7L)), listOf(Triple(0,1,3L), Triple(0,1,4L))))
        require(out == listOf(true, false))
    }
}