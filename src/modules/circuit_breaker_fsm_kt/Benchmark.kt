package com.igorkan.modules.circuit_breaker_fsm_kt

fun runBenchmark() {
    val cb = CircuitBreaker(BreakerPolicy(5, 1000L, 2))
    val t0 = System.nanoTime()
    var ok = 0
    for (i in 0 until 50000) {
        if (cb.allowRequest(i.toLong())) { ok++; cb.recordSuccess(i.toLong()) }
    }
    println("circuit_breaker_fsm_kt ns=${(System.nanoTime() - t0) / 50000} ok=$ok")
}
