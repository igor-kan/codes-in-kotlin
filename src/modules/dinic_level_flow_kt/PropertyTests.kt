package com.igorkan.modules.dinic_level_flow_kt

object PropertyTests {
    @JvmStatic
    fun main(args: Array<String>) {
        require(Concurrent.batchFold(4) != 0L)
        val g = DinicSolver(3); g.addEdge(0,1,7); g.addEdge(1,2,5); require(g.maxFlow(0,2) == 5L)
    }
}
