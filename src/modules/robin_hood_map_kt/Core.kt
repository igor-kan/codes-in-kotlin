package com.igorkan.modules.robin_hood_map_kt

class RobinHoodLongMap(initialCap: Int = 16) : PrimitiveLongMap {
    private var cap = maxOf(16, Integer.highestOneBit(initialCap - 1) shl 1)
    private var occupied = BooleanArray(cap)
    private var keys = LongArray(cap)
    private var vals = LongArray(cap)
    private var psls = IntArray(cap)
    private var len = 0

    private fun hashSlot(k: Long): Int {
        var z = k * 0x9e3779b97f4a7c15uL.toLong()
        z = (z xor (z ushr 30)) * 0xbf58476d1ce4e5b9uL.toLong()
        z = z xor (z ushr 31)
        return (z.toInt()) and (cap - 1)
    }

    private fun rehash() {
        val oldOcc = occupied
        val oldK = keys
        val oldV = vals
        cap = cap shl 1
        occupied = BooleanArray(cap)
        keys = LongArray(cap)
        vals = LongArray(cap)
        psls = IntArray(cap)
        len = 0
        for (i in oldOcc.indices) {
            if (oldOcc[i]) put(oldK[i], oldV[i])
        }
    }

    override fun put(key: Long, value: Long): Long? {
        if ((len + 1) * 4 >= cap * 3) rehash()
        var curK = key
        var curV = value
        var idx = hashSlot(key)
        var dist = 0
        val mask = cap - 1
        while (occupied[idx]) {
            if (keys[idx] == curK) {
                val old = vals[idx]
                vals[idx] = curV
                return old
            }
            if (psls[idx] < dist) {
                val tk = keys[idx]; keys[idx] = curK; curK = tk
                val tv = vals[idx]; vals[idx] = curV; curV = tv
                val td = psls[idx]; psls[idx] = dist; dist = td
            }
            idx = (idx + 1) and mask
            dist++
        }
        occupied[idx] = true
        keys[idx] = curK
        vals[idx] = curV
        psls[idx] = dist
        len++
        return null
    }

    override fun get(key: Long): Long? {
        var idx = hashSlot(key)
        var dist = 0
        val mask = cap - 1
        while (occupied[idx]) {
            if (psls[idx] < dist) return null
            if (keys[idx] == key) return vals[idx]
            idx = (idx + 1) and mask
            dist++
        }
        return null
    }

    override fun remove(key: Long): Long? {
        var idx = hashSlot(key)
        var dist = 0
        val mask = cap - 1
        while (occupied[idx] && psls[idx] >= dist) {
            if (keys[idx] == key) {
                val old = vals[idx]
                var nxt = (idx + 1) and mask
                while (occupied[nxt] && psls[nxt] > 0) {
                    keys[idx] = keys[nxt]
                    vals[idx] = vals[nxt]
                    psls[idx] = psls[nxt] - 1
                    idx = nxt
                    nxt = (idx + 1) and mask
                }
                occupied[idx] = false
                psls[idx] = 0
                len--
                return old
            }
            idx = (idx + 1) and mask
            dist++
        }
        return null
    }

    override fun size(): Int = len
}
