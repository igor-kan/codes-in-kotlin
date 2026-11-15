package com.igorkan.modules.circuit_breaker_fsm_kt

fun validateBreakerPolicy(policy: BreakerPolicy) {
    requireBreaker(policy.failureThreshold >= 1 && policy.openCooldownMs > 0L && policy.halfOpenProbesNeeded >= 1) {
        "invalid circuit breaker thresholds"
    }
}
