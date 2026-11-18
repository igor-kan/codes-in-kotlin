package com.igorkan.modules.li_chao_envelope_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val lc = LiChaoTree(32); lc.addLine(3, 1); lc.addLine(1, 10); require(lc.query(2) == 7L)
    }
}
