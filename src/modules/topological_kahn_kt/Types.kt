package com.igorkan.modules.topological_kahn_kt

data class TopoResult(
    val isAcyclic: Boolean,
    val order: IntArray,
    val waves: List<List<Int>>
)

data class DagEdge(
    val from: Int,
    val to: Int
)
