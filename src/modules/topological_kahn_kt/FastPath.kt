package com.igorkan.modules.topological_kahn_kt

fun criticalDepth(res: TopoResult): Int {
    if (!res.isAcyclic) return -1
    return res.waves.size
}

fun maxParallelismWidth(res: TopoResult): Int {
    var best = 0
    for (wave in res.waves) {
        if (wave.size > best) best = wave.size
    }
    return best
}
