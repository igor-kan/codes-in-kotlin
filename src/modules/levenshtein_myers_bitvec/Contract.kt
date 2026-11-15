package com.igorkan.modules.levenshtein_myers_bitvec

interface EditDistanceEngine {
    fun editDistance(pattern: String, text: String): Int
    fun isWithinDistance(pattern: String, text: String, maxDist: Int): Boolean {
        return editDistance(pattern, text) <= maxDist
    }
}
