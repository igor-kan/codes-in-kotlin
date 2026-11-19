package com.igorkan.modules.tarjan_scc_dag_kt

class TarjanScc(private val n: Int, edges: List<Pair<Int, Int>>) {
    private val adj = Array(n) { ArrayList<Int>() }
    init { for ((u, v) in edges) adj[u].add(v) }
    fun run(): Pair<Int, IntArray> {
        val dfn = IntArray(n) { -1 }; val low = IntArray(n); val comp = IntArray(n) { -1 }; val onSt = BooleanArray(n)
        val st = ArrayDeque<Int>()
        var timer = 0; var scc = 0
        fun dfs(u: Int) {
            dfn[u] = timer; low[u] = timer++; st.addLast(u); onSt[u] = true
            for (w in adj[u]) {
                if (dfn[w] == -1) { dfs(w); low[u] = minOf(low[u], low[w]) }
                else if (onSt[w]) low[u] = minOf(low[u], dfn[w])
            }
            if (low[u] == dfn[u]) {
                while (true) {
                    val v = st.removeLast(); onSt[v] = false; comp[v] = scc
                    if (v == u) break
                }
                scc++
            }
        }
        for (i in 0 until n) if (dfn[i] == -1) dfs(i)
        return scc to comp
    }
}
