package com.igorkan.modules.suffix_array_lcp_kt

import java.util.concurrent.Executors

object Concurrent {
    fun parallelCounts(docs: List<String>, pat: String): List<Int> {
        val b = KasaiSuffixBuilder()
        val pool = Executors.newFixedThreadPool(2)
        try {
            return docs.map { pool.submit<Int> { FastPath.countOccurrences(b.build(it), pat) } }.map { it.get() }
        } finally { pool.shutdown() }
    }
}
