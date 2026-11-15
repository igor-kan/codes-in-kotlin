package com.igorkan.modules.disjoint_set_rollback

fun runPropertyTests() {
    val dsu = RollbackDsu(32)
    val cps = ArrayList<Int>()
    for (i in 0 until 20) {
        cps.add(dsu.checkpoint())
        dsu.union(i, (i * 3 + 5) % 32)
        verifySizeConservation(dsu)
    }
    for (cp in cps.reversed()) {
        dsu.rollbackTo(cp)
        verifySizeConservation(dsu)
    }
    check(dsu.components == 32)
}
