package com.igorkan.modules.tarjan_scc_iterative_kt

fun isStronglyConnected(n: Int, edges: List<DiEdge>): Boolean {
    if (n <= 0) return false
    val summary = IterativeTarjanScc().decompose(n, edges)
    return summary.componentCount == 1
}

fun largestComponentSize(summary: SccSummary): Int {
    val counts = HashMap<Int, Int>()
    for (c in summary.componentIds) counts[c] = (counts[c] ?: 0) + 1
    return counts.values.maxOrNull() ?: 0
}
