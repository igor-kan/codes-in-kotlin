package com.igorkan.modules.skip_list_deterministic_kt

class DeterministicSkipList(private var seed: Long = 0x123456789L) : OrderedSkipDict {
    private val maxLvl = 16
    private val head = SkipNode(Long.MIN_VALUE, 0L, maxLvl)
    private var curLvl = 1
    var count: Int = 0
        private set

    private fun nextRandLevel(): Int {
        var lvl = 1
        while (lvl < maxLvl) {
            seed += 0x9e3779b97f4a7c15uL.toLong()
            var z = seed
            z = (z xor (z ushr 30)) * 0xbf58476d1ce4e5b9uL.toLong()
            if ((z and 1L) == 0L) break
            lvl++
        }
        return lvl
    }

    override fun put(key: Long, value: Long) {
        val update = arrayOfNulls<SkipNode>(maxLvl)
        var x = head
        for (i in (curLvl - 1) downTo 0) {
            while (x.next[i] != null && x.next[i]!!.key < key) x = x.next[i]!!
            update[i] = x
        }
        val cand = x.next[0]
        if (cand != null && cand.key == key) {
            cand.value = value
            return
        }
        val lvl = nextRandLevel()
        if (lvl > curLvl) {
            for (i in curLvl until lvl) update[i] = head
            curLvl = lvl
        }
        val node = SkipNode(key, value, lvl)
        for (i in 0 until lvl) {
            node.next[i] = update[i]!!.next[i]
            update[i]!!.next[i] = node
        }
        count++
    }

    override fun get(key: Long): Long? {
        var x = head
        for (i in (curLvl - 1) downTo 0) {
            while (x.next[i] != null && x.next[i]!!.key < key) x = x.next[i]!!
        }
        val cand = x.next[0]
        return if (cand != null && cand.key == key) cand.value else null
    }

    override fun delete(key: Long): Boolean {
        val update = arrayOfNulls<SkipNode>(maxLvl)
        var x = head
        for (i in (curLvl - 1) downTo 0) {
            while (x.next[i] != null && x.next[i]!!.key < key) x = x.next[i]!!
            update[i] = x
        }
        val target = x.next[0] ?: return false
        if (target.key != key) return false
        for (i in 0 until curLvl) {
            if (update[i]!!.next[i] !== target) break
            update[i]!!.next[i] = target.next[i]
        }
        while (curLvl > 1 && head.next[curLvl - 1] == null) curLvl--
        count--
        return true
    }

    override fun rangeQuery(lo: Long, hi: Long): SkipRangeResult {
        validateSkipRange(lo, hi)
        var x = head
        for (i in (curLvl - 1) downTo 0) {
            while (x.next[i] != null && x.next[i]!!.key < lo) x = x.next[i]!!
        }
        var cur = x.next[0]
        val ks = ArrayList<Long>()
        val vs = ArrayList<Long>()
        while (cur != null && cur.key <= hi) {
            ks.add(cur.key)
            vs.add(cur.value)
            cur = cur.next[0]
        }
        return SkipRangeResult(ks, vs)
    }
}
