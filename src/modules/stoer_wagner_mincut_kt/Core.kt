package com.igorkan.modules.stoer_wagner_mincut_kt

object StoerWagner {
    fun globalMinCut(adj: Array<LongArray>): Long {
        val n = adj.size
        val w = Array(n) { adj[it].clone() }
        val vtx = IntArray(n) { it }
        var best = Long.MAX_VALUE / 4
        for (m in n downTo 2) {
            val weight = LongArray(m)
            val used = BooleanArray(m)
            var prev = -1; var last = -1
            for (it in 0 until m) {
                var sel = -1
                for (i in 0 until m) if (!used[i] && (sel == -1 || weight[i] > weight[sel])) sel = i
                used[sel] = true; prev = last; last = sel
                for (i in 0 until m) if (!used[i]) weight[i] += w[vtx[sel]][vtx[i]]
            }
            best = minOf(best, weight[last])
            val u = vtx[prev]; val v = vtx[last]
            for (i in 0 until m) {
                val k = vtx[i]
                if (k != u && k != v) { w[u][k] += w[v][k]; w[k][u] += w[k][v] }
            }
            vtx[last] = vtx[m - 1]
        }
        return best
    }
}
