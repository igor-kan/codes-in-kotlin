package com.igorkan.modules.li_chao_envelope_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val lc = LiChaoTree(64); lc.addLine(2, 10); lc.addLine(-1, 50); lc.addLine(0, 25); require(lc.query(5) == 20L && lc.query(40) == 10L)
        Invariants.ensureTrue(true)
    }
}
