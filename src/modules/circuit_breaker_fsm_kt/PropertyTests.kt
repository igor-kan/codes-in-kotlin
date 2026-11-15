package com.igorkan.modules.circuit_breaker_fsm_kt

fun runPropertyTests() {
    val cb = CircuitBreaker(BreakerPolicy(2, 500L, 1))
    cb.recordFailure(10L)
    cb.recordFailure(20L)
    check(cb.allowRequest(520L))
    cb.recordFailure(521L) // half-open failure immediately re-opens!
    check(!cb.allowRequest(600L))
}
