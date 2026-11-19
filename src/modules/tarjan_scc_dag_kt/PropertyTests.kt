package com.igorkan.modules.tarjan_scc_dag_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        require(TarjanScc(3, listOf(0 to 1, 1 to 2)).run().first == 3)
    }
}
