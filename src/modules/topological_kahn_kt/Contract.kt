package com.igorkan.modules.topological_kahn_kt

interface DagSorter {
    fun sortLexMin(n: Int, edges: List<Pair<Int, Int>>): TopoResult
    fun hasCycle(n: Int, edges: List<Pair<Int, Int>>): Boolean {
        return !sortLexMin(n, edges).isAcyclic
    }
}
