package com.igorkan.modules.dijkstra_heap_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        val adj = listOf(listOf(1 to 2L), listOf(2 to 3L), emptyList()); require(DijkstraSolver().shortestPaths(3, adj, 0)[2] == 5L)
    }
}