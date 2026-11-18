package com.igorkan.modules.cuckoo_filter_fp8_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val cf = CuckooFilter(64); cf.insert(42L); require(cf.lookup(42L))
        Invariants.ensureTrue(true)
    }
}
