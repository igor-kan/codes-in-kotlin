package com.igorkan.modules.circuit_breaker_fsm_kt

fun isCallPermittedReadOnly(cb: CircuitBreaker, nowMs: Long): Boolean = when (val s = cb.currentState()) {
    is BreakerState.Open -> nowMs - s.openedAtMs >= 0L
    else -> true
}
