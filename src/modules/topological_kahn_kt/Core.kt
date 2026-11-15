package com.igorkan.modules.topological_kahn_kt

import java.util.PriorityQueue

class KahnDagSorter : DagSorter {
    override fun sortLexMin(n: Int, edges: List<Pair<Int, Int>>): TopoResult {
        val adj = Array(n) { ArrayList<Int>() }
        val indeg = IntArray(n)
        for ((u, v) in edges) {
            adj[u].add(v)
            indeg[v]++
        }
        val pq = PriorityQueue<Int>()
        for (i in 0 until n) if (indeg[i] == 0) pq.add(i)
        val out = IntArray(n)
        var k = 0
        while (pq.isNotEmpty()) {
            val u = pq.poll()
            out[k++] = u
            for (v in adj[u]) {
                indeg[v]--
                if (indeg[v] == 0) pq.add(v)
            }
        }
        return TopoResult(k == n, out.copyOf(k), extractWaves(n, adj))
    }

    private fun extractWaves(n: Int, adj: Array<ArrayList<Int>>): List<List<Int>> {
        val indeg = IntArray(n)
        for (row in adj) for (v in row) indeg[v]++
        var cur = (0 until n).filter { indeg[it] == 0 }
        val waves = ArrayList<List<Int>>()
        while (cur.isNotEmpty()) {
            waves.add(cur)
            val nxt = ArrayList<Int>()
            for (u in cur) for (v in adj[u]) if (--indeg[v] == 0) nxt.add(v)
            cur = nxt
        }
        return waves
    }
}
