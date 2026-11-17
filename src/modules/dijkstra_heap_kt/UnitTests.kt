package com.igorkan.modules.dijkstra_heap_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val adj = listOf(listOf(1 to 4L, 2 to 1L), listOf(3 to 1L), listOf(1 to 2L, 3 to 5L), emptyList()); val d = DijkstraSolver().shortestPaths(4, adj, 0); require(d[3] == 4L)
    }
}