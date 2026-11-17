package com.igorkan.modules.dijkstra_heap_kt

class DijkstraSolver {
    fun shortestPaths(n: Int, adj: List<List<Pair<Int, Long>>>, src: Int): LongArray {
        val dist = LongArray(n) { Long.MAX_VALUE / 4 }
        dist[src] = 0L
        val pq = java.util.PriorityQueue<Pair<Long, Int>>(compareBy { it.first })
        pq.add(0L to src)
        while (pq.isNotEmpty()) {
            val (d, u) = pq.poll()
            if (d > dist[u]) continue
            for ((v, w) in adj[u]) {
                if (dist[u] + w < dist[v]) { dist[v] = dist[u] + w; pq.add(dist[v] to v) }
            }
        }
        return dist
    }
}