package com.igorkan.modules.circuit_breaker_fsm_kt

fun runUnitTests() {
    val pol = BreakerPolicy(failureThreshold = 3, openCooldownMs = 1000L, halfOpenProbesNeeded = 2)
    validateBreakerPolicy(pol)
    val cb = CircuitBreaker(pol)
    repeat(3) { cb.recordFailure(100L) }
    check(cb.currentState() is BreakerState.Open)
    verifyOpenRejectsWithinCooldown(cb, 100L, 1000L)
    check(cb.allowRequest(1100L))
    check(cb.currentState() is BreakerState.HalfOpen)
    cb.recordSuccess(1101L)
    cb.recordSuccess(1102L)
    check(cb.currentState() is BreakerState.Closed)
}
