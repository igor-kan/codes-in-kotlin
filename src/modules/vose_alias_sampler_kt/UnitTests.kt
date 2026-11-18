package com.igorkan.modules.vose_alias_sampler_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val va = VoseAlias(doubleArrayOf(1.0, 3.0)); require(va.sample(1, 0.9) == 1)
        Invariants.ensureTrue(true)
    }
}
