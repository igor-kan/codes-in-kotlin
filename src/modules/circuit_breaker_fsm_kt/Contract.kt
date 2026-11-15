package com.igorkan.modules.circuit_breaker_fsm_kt

interface CircuitBreakerContract {
    fun allowRequest(nowMs: Long): Boolean
    fun recordSuccess(nowMs: Long)
    fun recordFailure(nowMs: Long)
    fun currentState(): BreakerState
}
