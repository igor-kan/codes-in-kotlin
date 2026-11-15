package com.igorkan.modules.topological_kahn_kt

fun validateEdgesBounds(n: Int, edges: List<Pair<Int, Int>>) {
    for ((u, v) in edges) {
        requireTopo(u in 0 until n && v in 0 until n) { "edge ($u,$v) out of [0,$n)" }
    }
}
