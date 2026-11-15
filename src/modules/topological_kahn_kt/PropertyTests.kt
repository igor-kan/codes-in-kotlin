package com.igorkan.modules.topological_kahn_kt

fun runPropertyTests() {
    val cyc = KahnDagSorter().sortLexMin(3, listOf(0 to 1, 1 to 2, 2 to 0))
    check(!cyc.isAcyclic && cyc.order.isEmpty())
}
