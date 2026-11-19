package com.igorkan.modules.fenwick_range_tree_d55

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val f = OrderFenwick(16); f.add(2, 3); f.add(5, 2); f.add(10, 4); require(f.kth(1) == 2 && f.kth(4) == 5 && f.kth(7) == 10)
        Invariants.ensureTrue(true)
    }
}
