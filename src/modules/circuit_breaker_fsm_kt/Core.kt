package com.igorkan.modules.circuit_breaker_fsm_kt

class CircuitBreaker(private val policy: BreakerPolicy) : CircuitBreakerContract {
    private var state: BreakerState = BreakerState.Closed
    private var consecutiveFailures: Int = 0

    override fun allowRequest(nowMs: Long): Boolean = when (val st = state) {
        is BreakerState.Closed -> true
        is BreakerState.Open -> {
            if (nowMs - st.openedAtMs >= policy.openCooldownMs) {
                state = BreakerState.HalfOpen(0)
                true
            } else {
                false
            }
        }
        is BreakerState.HalfOpen -> true
    }

    override fun recordSuccess(nowMs: Long) {
        when (val st = state) {
            is BreakerState.Closed -> consecutiveFailures = 0
            is BreakerState.HalfOpen -> {
                val nextOk = st.probeSuccesses + 1
                if (nextOk >= policy.halfOpenProbesNeeded) {
                    state = BreakerState.Closed
                    consecutiveFailures = 0
                } else {
                    state = BreakerState.HalfOpen(nextOk)
                }
            }
            is BreakerState.Open -> {}
        }
    }

    override fun recordFailure(nowMs: Long) {
        when (state) {
            is BreakerState.Closed -> {
                consecutiveFailures++
                if (consecutiveFailures >= policy.failureThreshold) {
                    state = BreakerState.Open(nowMs)
                }
            }
            is BreakerState.HalfOpen -> state = BreakerState.Open(nowMs)
            is BreakerState.Open -> state = BreakerState.Open(nowMs)
        }
    }

    override fun currentState(): BreakerState = state
}
