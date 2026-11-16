package com.igorkan.modules.tarjan_scc_iterative_kt

fun propDeepChainNoStackOverflow() {
    val n = 8000
    val chain = (0 until n - 1).map { DiEdge(it, it + 1) }
    val res = IterativeTarjanScc().decompose(n, chain)
    requireSccKt(res.componentCount == n) { "chain should split into n trivial SCCs" }
    verifyCondensationDag(chain, res)
}
