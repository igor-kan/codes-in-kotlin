package com.igorkan.modules.dinic_level_flow_kt

object UnitTests {
    @JvmStatic
    fun main(args: Array<String>) {
        Validation.checkPositive(1)
        val g = DinicSolver(4); g.addEdge(0,1,10); g.addEdge(0,2,10); g.addEdge(1,2,2); g.addEdge(1,3,8); g.addEdge(2,3,10); require(g.maxFlow(0,3) == 18L)
        Invariants.ensureTrue(true)
    }
}
