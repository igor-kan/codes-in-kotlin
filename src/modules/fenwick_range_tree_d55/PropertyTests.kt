package com.igorkan.modules.fenwick_range_tree_d55

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val f = OrderFenwick(8); f.add(0, 1); f.add(7, 1); require(f.kth(2) == 7)
    }
}
