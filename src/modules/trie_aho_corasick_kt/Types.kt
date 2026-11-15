package com.igorkan.modules.trie_aho_corasick_kt

class AcState {
    val next = HashMap<Char, Int>()
    var fail: Int = 0
    var dictLink: Int = 0
    val outputs = ArrayList<Int>()
}

data class AcMatch(val patternIndex: Int, val offset: Int, val pattern: String)
