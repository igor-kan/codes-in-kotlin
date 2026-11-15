package com.igorkan.modules.suffix_radix_matcher

fun verifyLexSortedAndLcp(idx: SuffixIndex) {
    val s = idx.text
    for (i in 1 until idx.sa.size) {
        val a = s.substring(idx.sa[i - 1])
        val b = s.substring(idx.sa[i])
        requireSuffix(a < b) { "SA unsorted at $i" }
        var exact = 0
        while (exact < a.length && exact < b.length && a[exact] == b[exact]) exact++
        requireSuffix(idx.lcp[i] == exact) { "LCP[$i]=${idx.lcp[i]} != $exact" }
    }
}
