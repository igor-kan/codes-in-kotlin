package com.igorkan.modules.circuit_breaker_fsm_kt

fun verifyOpenRejectsWithinCooldown(cb: CircuitBreaker, openedAt: Long, cooldown: Long) {
    if (cb.currentState() is BreakerState.Open) {
        requireBreaker(!cb.allowRequest(openedAt + cooldown - 1)) { "open circuit allowed premature call" }
    }
}
