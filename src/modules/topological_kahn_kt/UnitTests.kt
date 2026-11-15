package com.igorkan.modules.topological_kahn_kt

fun runUnitTests() {
    val edges = listOf(0 to 2, 1 to 2, 2 to 3, 1 to 3)
    validateEdgesBounds(4, edges)
    val res = KahnDagSorter().sortLexMin(4, edges)
    check(res.isAcyclic && res.order.contentEquals(intArrayOf(0, 1, 2, 3)))
    verifyTopologicalPrecedence(4, edges, res)
}
