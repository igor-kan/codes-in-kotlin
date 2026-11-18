package com.igorkan.modules.vose_alias_sampler_kt

class VoseAlias(weights: DoubleArray) {
    val prob = DoubleArray(weights.size) { 1.0 }
    val alias = IntArray(weights.size) { it }
    init {
        val n = weights.size
        val sum = weights.sum()
        val scaled = DoubleArray(n) { weights[it] * n / sum }
        val small = ArrayDeque<Int>()
        val large = ArrayDeque<Int>()
        for (i in 0 until n) if (scaled[i] < 1.0) small.add(i) else large.add(i)
        while (small.isNotEmpty() && large.isNotEmpty()) {
            val s = small.removeLast(); val l = large.removeLast()
            prob[s] = scaled[s]; alias[s] = l
            scaled[l] = (scaled[l] + scaled[s]) - 1.0
            if (scaled[l] < 1.0) small.add(l) else large.add(l)
        }
    }
    fun sample(bucket: Int, u01: Double): Int = if (u01 < prob[bucket]) bucket else alias[bucket]
}
