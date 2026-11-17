package com.igorkan.modules.count_min_sketch_kt

class CountMinSketch(val depth: Int, val width: Int) {
    private val grid = Array(depth) { LongArray(width) }
    private fun mix(x: Long, seed: Long): Int {
        var z = x xor (seed * -7046029254386353131L)
        z = (z xor (z ushr 30)) * -4658895280553007687L
        z = (z xor (z ushr 27)) * -7723592293110705685L
        return ((z ushr 16) % width.toLong()).toInt().let { if (it < 0) it + width else it }
    }
    fun add(key: Long, delta: Long = 1L) {
        val slots = IntArray(depth) { d -> mix(key, (d + 1).toLong()) }
        var mn = Long.MAX_VALUE
        for (d in 0 until depth) mn = minOf(mn, grid[d][slots[d]])
        val target = mn + delta
        for (d in 0 until depth) if (grid[d][slots[d]] < target) grid[d][slots[d]] = target
    }
    fun estimate(key: Long): Long {
        var mn = Long.MAX_VALUE
        for (d in 0 until depth) mn = minOf(mn, grid[d][mix(key, (d + 1).toLong())])
        return mn
    }
}