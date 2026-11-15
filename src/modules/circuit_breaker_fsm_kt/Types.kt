package com.igorkan.modules.circuit_breaker_fsm_kt

sealed interface BreakerState {
    data object Closed : BreakerState
    data class Open(val openedAtMs: Long) : BreakerState
    data class HalfOpen(val probeSuccesses: Int) : BreakerState
}

data class BreakerPolicy(
    val failureThreshold: Int,
    val openCooldownMs: Long,
    val halfOpenProbesNeeded: Int
)
