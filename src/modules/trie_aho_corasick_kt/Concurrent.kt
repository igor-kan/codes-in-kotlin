package com.igorkan.modules.trie_aho_corasick_kt

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun parallelScan(ac: AhoCorasickMatcher, docs: List<String>): List<List<AcMatch>> {
    val pool = Executors.newFixedThreadPool(4)
    return try {
        pool.invokeAll(docs.map { doc -> Callable { ac.scan(doc) } }).map { it.get() }
    } finally {
        pool.shutdown()
    }
}
