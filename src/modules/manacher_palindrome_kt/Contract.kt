package com.igorkan.modules.manacher_palindrome_kt

interface PalindromeAnalyzer {
    fun analyze(text: String): PalinSummary
    fun tag(): String = "manacher_palindrome_kt"
    fun maxInputLen(): Int = 1 shl 24
}