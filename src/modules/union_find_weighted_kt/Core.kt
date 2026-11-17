package com.igorkan.modules.union_find_weighted_kt

class WeightedUnionFind(private val n: Int) : PotentialDsu {
    private val parent = IntArray(n) { it }
    private val weight = LongArray(n)

    fun findWithWeight(x: Int): FindResult {
        Validation.requireNode(n, x)
        if (parent[x] == x) return FindResult(x, 0L)
        val res = findWithWeight(parent[x])
        parent[x] = res.root
        weight[x] += res.weightToRoot
        return FindResult(parent[x], weight[x])
    }

    override fun relate(u: Int, v: Int, diffUminusV: Long): Boolean {
        val ru = findWithWeight(u)
        val rv = findWithWeight(v)
        if (ru.root == rv.root) return (ru.weightToRoot - rv.weightToRoot) == diffUminusV
        parent[ru.root] = rv.root
        weight[ru.root] = diffUminusV - ru.weightToRoot + rv.weightToRoot
        return true
    }

    override fun diff(u: Int, v: Int): Long? {
        val ru = findWithWeight(u)
        val rv = findWithWeight(v)
        return if (ru.root != rv.root) null else ru.weightToRoot - rv.weightToRoot
    }
}
