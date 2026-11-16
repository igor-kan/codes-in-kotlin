package com.igorkan.modules.tarjan_scc_iterative_kt

fun testTarjanSccTwoCycles() {
    val es = listOf(DiEdge(0, 1), DiEdge(1, 2), DiEdge(2, 0), DiEdge(1, 3), DiEdge(3, 4), DiEdge(4, 3))
    val res = IterativeTarjanScc().decompose(5, es)
    requireSccKt(res.componentCount == 2) { "expected 2 SCCs" }
    verifyCondensationDag(es, res)
}
