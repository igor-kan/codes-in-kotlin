package com.igorkan.modules.levenshtein_myers_bitvec

class MyersBitVecDistance : EditDistanceEngine {
    override fun editDistance(pattern: String, text: String): Int {
        val m = pattern.length
        if (m == 0) return text.length
        if (m > 63) throw EditDistException.OutOfBounds("single-word Myers requires len <= 63")
        val peq = HashMap<Char, Long>()
        for (i in 0 until m) {
            peq[pattern[i]] = (peq[pattern[i]] ?: 0L) or (1L shl i)
        }
        var pv = (1L shl m) - 1L
        var mv = 0L
        var score = m
        val highBit = 1L shl (m - 1)
        val mask = (1L shl m) - 1L
        for (ch in text) {
            val eq = peq[ch] ?: 0L
            val xv = eq or mv
            val xh = (((eq and pv) + pv) xor pv) or eq
            var ph = mv or (pv or xh).inv()
            var mh = pv and xh
            if ((ph and highBit) != 0L) score++
            if ((mh and highBit) != 0L) score--
            ph = ((ph shl 1) or 1L) and mask
            mh = (mh shl 1) and mask
            pv = mh or (xv or ph).inv()
            mv = ph and xv
        }
        return score
    }
}
