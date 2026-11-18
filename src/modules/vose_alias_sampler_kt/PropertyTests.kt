package com.igorkan.modules.vose_alias_sampler_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val va = VoseAlias(doubleArrayOf(2.0, 2.0)); require(va.sample(0, 0.2) == 0)
    }
}
