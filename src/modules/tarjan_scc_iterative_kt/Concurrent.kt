package com.igorkan.modules.tarjan_scc_iterative_kt

fun batchComponentCounts(graphs: List<Pair<Int, List<DiEdge>>>): List<Int> {
    val solver = IterativeTarjanScc()
    return graphs.map { (n, es) -> solver.decompose(n, es).componentCount }
}
