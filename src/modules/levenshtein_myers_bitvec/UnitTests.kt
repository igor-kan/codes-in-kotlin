package com.igorkan.modules.levenshtein_myers_bitvec

fun runUnitTests() {
    validatePatternWordLimit("kitten")
    verifyMyersEqualsOracle("kitten", "sitting")
    verifyMyersEqualsOracle("algorithm", "altruistic")
    verifyMyersEqualsOracle("", "hello")
}
