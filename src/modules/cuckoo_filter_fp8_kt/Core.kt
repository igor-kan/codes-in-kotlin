package com.igorkan.modules.cuckoo_filter_fp8_kt

class CuckooFilter(bucketsPow2: Int) {
    private val mask = bucketsPow2 - 1
    private val table = Array(bucketsPow2) { IntArray(4) }
    private fun fpIdx(key: Long): Triple<Int, Int, Int> {
        val h = ((key xor (key ushr 30)) * -4658895280553007687L).toInt()
        val fp = ((h ushr 16) and 0xff) or 1
        val i1 = h and mask
        val i2 = (i1 xor (fp * 0x5bd1e995)) and mask
        return Triple(fp, i1, i2)
    }
    fun insert(key: Long): Boolean {
        val (fp, i1, i2) = fpIdx(key)
        for (idx in intArrayOf(i1, i2)) for (s in 0..3) if (table[idx][s] == 0) { table[idx][s] = fp; return true }
        return false
    }
    fun lookup(key: Long): Boolean {
        val (fp, i1, i2) = fpIdx(key)
        return (0..3).any { table[i1][it] == fp || table[i2][it] == fp }
    }
}
