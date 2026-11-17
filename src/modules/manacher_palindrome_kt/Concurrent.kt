package com.igorkan.modules.manacher_palindrome_kt

import java.util.concurrent.Executors

object Concurrent {
    fun parallelPalinTotal(texts: List<String>): Long {
        val engine = ManacherEngine()
        val pool = Executors.newFixedThreadPool(2)
        try {
            return texts.map { pool.submit<Long> { engine.analyze(it).count } }.sumOf { it.get() }
        } finally { pool.shutdown() }
    }
}
