package com.igorkan.modules.hopcroft_karp_match_kt

class HopcroftKarp(private val nL: Int, private val nR: Int, edges: List<Pair<Int, Int>>) {
    private val adj = Array(nL) { ArrayList<Int>() }
    init { for ((u, v) in edges) adj[u].add(v) }
    fun maxMatching(): Int {
        val pairU = IntArray(nL) { -1 }
        val pairV = IntArray(nR) { -1 }
        val dist = IntArray(nL)
        fun bfs(): Boolean {
            val q = ArrayDeque<Int>()
            for (u in 0 until nL) if (pairU[u] == -1) { dist[u] = 0; q.add(u) } else dist[u] = Int.MAX_VALUE
            var found = false
            while (q.isNotEmpty()) {
                val u = q.removeFirst()
                for (v in adj[u]) {
                    val u2 = pairV[v]
                    if (u2 == -1) found = true
                    else if (dist[u2] == Int.MAX_VALUE) { dist[u2] = dist[u] + 1; q.add(u2) }
                }
            }
            return found
        }
        fun dfs(u: Int): Boolean {
            for (v in adj[u]) {
                val u2 = pairV[v]
                if (u2 == -1 || (dist[u2] == dist[u] + 1 && dfs(u2))) { pairU[u] = v; pairV[v] = u; return true }
            }
            dist[u] = Int.MAX_VALUE
            return false
        }
        var size = 0
        while (bfs()) for (u in 0 until nL) if (pairU[u] == -1 && dfs(u)) size++
        return size
    }
}
