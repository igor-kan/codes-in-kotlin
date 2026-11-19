package com.igorkan.modules.kmp_prefix_automaton_kt

object KmpScanner {
    fun searchAll(text: String, pat: String): List<Int> {
        val m = pat.length
        val pi = IntArray(m)
        var j = 0
        for (i in 1 until m) {
            while (j > 0 && pat[i] != pat[j]) j = pi[j - 1]
            if (pat[i] == pat[j]) j++
            pi[i] = j
        }
        val hits = ArrayList<Int>()
        j = 0
        for (i in text.indices) {
            while (j > 0 && text[i] != pat[j]) j = pi[j - 1]
            if (text[i] == pat[j]) j++
            if (j == m) { hits.add(i - m + 1); j = pi[j - 1] }
        }
        return hits
    }
}
