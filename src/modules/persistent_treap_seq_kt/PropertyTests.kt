package com.igorkan.modules.persistent_treap_seq_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val r = PersistentTreap.make(42L, 1); require(PersistentTreap.sum(r) == 42L)
    }
}
