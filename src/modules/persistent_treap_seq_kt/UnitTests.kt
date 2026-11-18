package com.igorkan.modules.persistent_treap_seq_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        var r: PTNode? = null; for (i in 1..5) r = PersistentTreap.merge(r, PersistentTreap.make(i * 10L, i * 99991)); require(PersistentTreap.sum(r) == 150L)
        Invariants.ensureTrue(true)
    }
}
