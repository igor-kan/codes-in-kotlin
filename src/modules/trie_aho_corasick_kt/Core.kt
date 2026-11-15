package com.igorkan.modules.trie_aho_corasick_kt

import java.util.ArrayDeque

class AhoCorasickMatcher(val patterns: List<String>) : MultiMatcher {
    val states = ArrayList<AcState>()

    init {
        if (patterns.isEmpty() || patterns.any { it.isEmpty() }) {
            throw AhoException.InvalidArgument("non-empty patterns required")
        }
        states.add(AcState())
        patterns.forEachIndexed { pid, pat ->
            var cur = 0
            for (ch in pat) {
                cur = states[cur].next.getOrPut(ch) {
                    val nid = states.size
                    states.add(AcState())
                    nid
                }
            }
            states[cur].outputs.add(pid)
        }
        buildFailLinks()
    }

    private fun buildFailLinks() {
        val q = ArrayDeque<Int>()
        for (child in states[0].next.values) {
            states[child].fail = 0
            states[child].dictLink = 0
            q.add(child)
        }
        while (q.isNotEmpty()) {
            val u = q.removeFirst()
            for ((ch, v) in states[u].next) {
                var f = states[u].fail
                while (f != 0 && !states[f].next.containsKey(ch)) f = states[f].fail
                val target = states[f].next[ch] ?: 0
                states[v].fail = target
                states[v].dictLink = if (states[target].outputs.isNotEmpty()) target else states[target].dictLink
                q.add(v)
            }
        }
    }

    override fun scan(text: String): List<AcMatch> {
        val hits = ArrayList<AcMatch>()
        var s = 0
        for (i in text.indices) {
            val ch = text[i]
            while (s != 0 && !states[s].next.containsKey(ch)) s = states[s].fail
            s = states[s].next[ch] ?: 0
            var cur = if (states[s].outputs.isNotEmpty()) s else states[s].dictLink
            while (cur != 0) {
                for (pid in states[cur].outputs) {
                    val p = patterns[pid]
                    hits.add(AcMatch(pid, i - p.length + 1, p))
                }
                cur = states[cur].dictLink
            }
        }
        return hits
    }
}
