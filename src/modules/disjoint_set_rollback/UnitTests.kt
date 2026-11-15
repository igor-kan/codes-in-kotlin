package com.igorkan.modules.disjoint_set_rollback

fun runUnitTests() {
    val dsu = RollbackDsu(6)
    dsu.union(0, 1)
    dsu.union(2, 3)
    val cp = dsu.checkpoint()
    dsu.union(1, 2)
    check(sameComponent(dsu, 0, 3))
    check(dsu.components == 3)
    dsu.rollbackTo(cp)
    check(!sameComponent(dsu, 0, 3))
    check(dsu.components == 4)
    verifySizeConservation(dsu)
}
