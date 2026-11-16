package com.igorkan.modules.tarjan_scc_iterative_kt

fun validateDigraphEdges(n: Int, edges: List<DiEdge>) {
    if (n <= 0) throw SccKtException.InvalidArgument("vertex count must be > 0")
    for (e in edges) {
        if (e.from < 0 || e.from >= n || e.to < 0 || e.to >= n) {
            throw SccKtException.OutOfBounds("edge endpoint out of bounds: $e")
        }
    }
}
