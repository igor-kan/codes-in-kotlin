package com.igorkan.modules.kmp_z_matcher_kt

fun minimalPeriod(s: CharSequence): Int {
    val lps = DualStringMatcher().buildLps(s)
    val n = s.length
    val p = n - lps[n - 1]
    return if (n % p == 0) p else n
}
