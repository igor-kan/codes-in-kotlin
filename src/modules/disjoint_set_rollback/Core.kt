package com.igorkan.modules.disjoint_set_rollback

class RollbackDsu(val n: Int) : RollbackDsuContract {
    val parent = IntArray(n) { it }
    val compSize = IntArray(n) { 1 }
    var components: Int = n
        private set
    private val history = ArrayList<UndoRecord>()

    init {
        if (n <= 0) throw DsuException.InvalidArgument("n must be > 0")
    }

    override fun find(x: Int): Int {
        var cur = x
        while (parent[cur] != cur) cur = parent[cur]
        return cur
    }

    override fun union(u: Int, v: Int): Boolean {
        var ru = find(u)
        var rv = find(v)
        if (ru == rv) return false
        if (compSize[ru] < compSize[rv]) {
            val tmp = ru; ru = rv; rv = tmp
        }
        history.add(UndoRecord(rv, ru, compSize[ru]))
        parent[rv] = ru
        compSize[ru] += compSize[rv]
        components--
        return true
    }

    override fun checkpoint(): Int = history.size

    override fun rollbackTo(targetHeight: Int) {
        if (targetHeight < 0 || targetHeight > history.size) throw DsuException.OutOfBounds("bad target")
        while (history.size > targetHeight) {
            val rec = history.removeAt(history.size - 1)
            parent[rec.child] = rec.child
            compSize[rec.parent] = rec.prevParentSize
            components++
        }
    }
}
