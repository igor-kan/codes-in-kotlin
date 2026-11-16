package com.igorkan.modules.tarjan_scc_iterative_kt

class IterativeTarjanScc : DirectedSccSolver {
    override fun decompose(n: Int, edges: List<DiEdge>): SccSummary {
        validateDigraphEdges(n, edges)
        val head = IntArray(n) { -1 }
        val to = IntArray(edges.size)
        val next = IntArray(edges.size)
        for (i in edges.indices) {
            val e = edges[i]
            to[i] = e.to
            next[i] = head[e.from]
            head[e.from] = i
        }

        val disc = IntArray(n) { -1 }
        val low = IntArray(n)
        val onStack = BooleanArray(n)
        val tStack = IntArray(n)
        var tTop = 0
        val callU = IntArray(n + 2)
        val callCur = IntArray(n + 2)
        var cTop = 0

        val comp = IntArray(n) { -1 }
        var numComps = 0
        var timer = 0

        for (root in 0 until n) {
            if (disc[root] != -1) continue
            disc[root] = timer
            low[root] = timer
            timer++
            tStack[tTop++] = root
            onStack[root] = true
            callU[cTop] = root
            callCur[cTop] = head[root]
            cTop++

            while (cTop > 0) {
                val u = callU[cTop - 1]
                val edgeIdx = callCur[cTop - 1]
                if (edgeIdx != -1) {
                    callCur[cTop - 1] = next[edgeIdx]
                    val v = to[edgeIdx]
                    if (disc[v] == -1) {
                        disc[v] = timer
                        low[v] = timer
                        timer++
                        tStack[tTop++] = v
                        onStack[v] = true
                        callU[cTop] = v
                        callCur[cTop] = head[v]
                        cTop++
                    } else if (onStack[v] && disc[v] < low[u]) {
                        low[u] = disc[v]
                    }
                } else {
                    cTop--
                    if (cTop > 0) {
                        val p = callU[cTop - 1]
                        if (low[u] < low[p]) low[p] = low[u]
                    }
                    if (low[u] == disc[u]) {
                        val cid = numComps++
                        while (true) {
                            val w = tStack[--tTop]
                            onStack[w] = false
                            comp[w] = cid
                            if (w == u) break
                        }
                    }
                }
            }
        }
        return SccSummary(comp, numComps)
    }
}
