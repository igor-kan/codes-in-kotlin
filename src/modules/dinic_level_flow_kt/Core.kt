package com.igorkan.modules.dinic_level_flow_kt

class DinicSolver(private val n: Int) {
    data class Edge(val to: Int, val rev: Int, var cap: Long)
    private val adj = Array(n) { ArrayList<Edge>() }
    fun addEdge(u: Int, v: Int, cap: Long) {
        adj[u].add(Edge(v, adj[v].size, cap))
        adj[v].add(Edge(u, adj[u].size - 1, 0L))
    }
    fun maxFlow(s: Int, t: Int): Long {
        var flow = 0L
        val level = IntArray(n)
        val ptr = IntArray(n)
        while (true) {
            level.fill(-1); level[s] = 0
            val q = ArrayDeque<Int>(); q.add(s)
            while (q.isNotEmpty()) {
                val u = q.removeFirst()
                for (e in adj[u]) if (e.cap > 0 && level[e.to] < 0) { level[e.to] = level[u] + 1; q.add(e.to) }
            }
            if (level[t] < 0) break
            ptr.fill(0)
            fun dfs(u: Int, pushed: Long): Long {
                if (pushed == 0L || u == t) return pushed
                while (ptr[u] < adj[u].size) {
                    val e = adj[u][ptr[u]]
                    if (level[e.to] == level[u] + 1 && e.cap > 0) {
                        val tr = dfs(e.to, minOf(pushed, e.cap))
                        if (tr > 0) { e.cap -= tr; adj[e.to][e.rev].cap += tr; return tr }
                    }
                    ptr[u]++
                }
                return 0L
            }
            while (true) {
                val p = dfs(s, Long.MAX_VALUE / 4)
                if (p == 0L) break
                flow += p
            }
        }
        return flow
    }
}
