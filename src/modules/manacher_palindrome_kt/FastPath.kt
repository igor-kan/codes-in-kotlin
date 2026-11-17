package com.igorkan.modules.manacher_palindrome_kt

object FastPath {
    fun isPalinSlice(s: String, lo: Int, hi: Int): Boolean {
        var l = lo; var r = hi - 1
        while (l < r) if (s[l++] != s[r--]) return false
        return true
    }
}