package com.igorkan.modules.topological_kahn_kt

import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun executeDagWaves(res: TopoResult, worker: (Int) -> Int): Int {
    val pool = Executors.newFixedThreadPool(4)
    return try {
        var total = 0
        for (w in res.waves) {
            val vals = pool.invokeAll(w.map { node -> Callable { worker(node) } }).map { it.get() }
            total += vals.sum()
        }
        total
    } finally {
        pool.shutdown()
    }
}
