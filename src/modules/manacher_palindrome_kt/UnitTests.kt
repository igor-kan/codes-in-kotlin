package com.igorkan.modules.manacher_palindrome_kt

object UnitTests {
    @JvmStatic fun main(args: Array<String>) {
        val e = ManacherEngine()
        Invariants.verifyBrute("babad", e.analyze("babad"))
        Invariants.verifyBrute("cbbd", e.analyze("cbbd"))
    }
}