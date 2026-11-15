package com.igorkan.modules.suffix_radix_matcher

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun batchBuildSuffixIndices(texts: List<String>): List<SuffixIndex> {
    val b = RadixSuffixBuilder()
    val pool = Executors.newFixedThreadPool(4)
    return try {
        pool.invokeAll(texts.map { t -> Callable { b.buildIndex(t) } }).map { it.get() }
    } finally {
        pool.shutdown()
    }
}
