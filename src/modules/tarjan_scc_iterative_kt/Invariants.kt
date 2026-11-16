package com.igorkan.modules.tarjan_scc_iterative_kt

fun verifyCondensationDag(edges: List<DiEdge>, res: SccSummary) {
    for (c in res.componentIds) {
        requireSccKt(c in 0 until res.componentCount) { "unassigned or oob component id" }
    }
    for (e in edges) {
        val cu = res.componentIds[e.from]
        val cv = res.componentIds[e.to]
        requireSccKt(cu >= cv) { "reverse topological condensation order violated: $cu -> $cv" }
    }
}
