package com.igorkan.modules.manacher_palindrome_kt

object PropertyTests {
    @JvmStatic fun main(args: Array<String>) {
        require(Concurrent.parallelPalinTotal(listOf("aba", "abba")) == 10L)
    }
}