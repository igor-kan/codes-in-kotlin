package com.igorkan.modules.dinic_level_flow_kt

object FastPath {
    fun quickFold(a: LongArray): Long {
        var h = 1469598103934665603L
        for (v in a) {
            h = (h xor v) * 1099511628211L
        }
        return h
    }
}
