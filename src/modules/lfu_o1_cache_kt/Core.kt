package com.igorkan.modules.lfu_o1_cache_kt

class LfuCache(private val cap: Int) {
    private data class Entry(var value: Int, var freq: Int)
    private val items = HashMap<Int, Entry>()
    private val buckets = HashMap<Int, LinkedHashSet<Int>>()
    private var minFreq = 0
    fun get(key: Int): Int {
        val e = items[key] ?: return -1
        promote(key, e)
        return e.value
    }
    fun put(key: Int, value: Int) {
        if (cap <= 0) return
        items[key]?.let { it.value = value; promote(key, it); return }
        if (items.size >= cap) {
            val victimSet = buckets[minFreq]!!
            val victim = victimSet.iterator().next()
            victimSet.remove(victim)
            items.remove(victim)
        }
        items[key] = Entry(value, 1)
        buckets.getOrPut(1) { LinkedHashSet() }.add(key)
        minFreq = 1
    }
    private fun promote(key: Int, e: Entry) {
        val cur = buckets[e.freq]!!
        cur.remove(key)
        if (cur.isEmpty() && e.freq == minFreq) minFreq++
        e.freq++
        buckets.getOrPut(e.freq) { LinkedHashSet() }.add(key)
    }
}