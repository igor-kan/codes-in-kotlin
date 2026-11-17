package com.igorkan.modules.manacher_palindrome_kt

object Benchmark {
    @JvmStatic
    fun main(args: Array<String>) {
        val t0 = System.nanoTime()
        var sink = 0L
        val e = ManacherEngine(); val s = "abacaba".repeat(16); repeat(200) { sink += e.analyze(s).count }
        val ns = System.nanoTime() - t0
        println("manacher_palindrome_kt ns=$ns sink=$sink")
    }
}
