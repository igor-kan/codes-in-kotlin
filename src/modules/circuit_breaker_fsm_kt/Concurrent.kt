package com.igorkan.modules.circuit_breaker_fsm_kt

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class ThreadSafeCircuitBreaker(policy: BreakerPolicy) : CircuitBreakerContract {
    private val lock = ReentrantLock()
    private val inner = CircuitBreaker(policy)

    override fun allowRequest(nowMs: Long): Boolean = lock.withLock { inner.allowRequest(nowMs) }
    override fun recordSuccess(nowMs: Long) = lock.withLock { inner.recordSuccess(nowMs) }
    override fun recordFailure(nowMs: Long) = lock.withLock { inner.recordFailure(nowMs) }
    override fun currentState(): BreakerState = lock.withLock { inner.currentState() }
}
