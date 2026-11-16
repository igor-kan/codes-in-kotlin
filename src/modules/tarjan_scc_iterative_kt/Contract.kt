package com.igorkan.modules.tarjan_scc_iterative_kt

interface DirectedSccSolver {
    fun decompose(n: Int, edges: List<DiEdge>): SccSummary

    fun countComponents(n: Int, edges: List<DiEdge>): Int {
        return decompose(n, edges).componentCount
    }
}
