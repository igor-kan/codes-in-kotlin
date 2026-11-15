package com.igorkan.modules.disjoint_set_rollback

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class GuardedRollbackDsu(n: Int) {
    private val lock = ReentrantLock()
    private val inner = RollbackDsu(n)

    fun withCheckpoint(block: (RollbackDsu) -> Unit) = lock.withLock {
        val cp = inner.checkpoint()
        try { block(inner) } finally { inner.rollbackTo(cp) }
    }
}
