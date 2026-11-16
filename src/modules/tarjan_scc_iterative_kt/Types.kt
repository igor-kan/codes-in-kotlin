package com.igorkan.modules.tarjan_scc_iterative_kt

data class DiEdge(
    val from: Int,
    val to: Int
)

data class SccSummary(
    val componentIds: IntArray,
    val componentCount: Int
)
