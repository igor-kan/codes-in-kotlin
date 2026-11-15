package com.igorkan.modules.topological_kahn_kt

fun verifyTopologicalPrecedence(n: Int, edges: List<Pair<Int, Int>>, res: TopoResult) {
    if (!res.isAcyclic) return
    val pos = IntArray(n)
    res.order.forEachIndexed { idx, v -> pos[v] = idx }
    for ((u, v) in edges) requireTopo(pos[u] < pos[v]) { "inverted edge $u->$v" }
}
