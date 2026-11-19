package com.igorkan.modules.tarjan_scc_dag_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val (cnt, comp) = TarjanScc(4, listOf(0 to 1, 1 to 2, 2 to 0, 2 to 3)).run(); require(cnt == 2 && comp[0] == comp[2])
        Invariants.ensureTrue(true)
    }
}
