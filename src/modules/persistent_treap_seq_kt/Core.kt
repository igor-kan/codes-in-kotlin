package com.igorkan.modules.persistent_treap_seq_kt

data class PTNode(val v: Long, val prio: Int, val sz: Int, val sum: Long, val l: PTNode? = null, val r: PTNode? = null)
object PersistentTreap {
    fun sz(n: PTNode?): Int = n?.sz ?: 0
    fun sum(n: PTNode?): Long = n?.sum ?: 0L
    fun make(v: Long, prio: Int, l: PTNode? = null, r: PTNode? = null) = PTNode(v, prio, 1 + sz(l) + sz(r), v + sum(l) + sum(r), l, r)
    fun split(u: PTNode?, k: Int): Pair<PTNode?, PTNode?> {
        if (u == null) return null to null
        val lsz = sz(u.l)
        return if (k <= lsz) {
            val (ll, lr) = split(u.l, k)
            ll to make(u.v, u.prio, lr, u.r)
        } else {
            val (rl, rr) = split(u.r, k - lsz - 1)
            make(u.v, u.prio, u.l, rl) to rr
        }
    }
    fun merge(a: PTNode?, b: PTNode?): PTNode? {
        if (a == null) return b
        if (b == null) return a
        return if (a.prio > b.prio) make(a.v, a.prio, a.l, merge(a.r, b))
        else make(b.v, b.prio, merge(a, b.l), b.r)
    }
}
