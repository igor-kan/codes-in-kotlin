package com.igorkan.modules.cartesian_rmq_tree_kt

class CartesianRmq(arr: LongArray) {
    val left = IntArray(arr.size) { -1 }
    val right = IntArray(arr.size) { -1 }
    var root = -1
    init {
        val st = IntArray(arr.size)
        var top = 0
        for (i in arr.indices) {
            var last = -1
            while (top > 0 && arr[st[top - 1]] > arr[i]) last = st[--top]
            if (top > 0) right[st[top - 1]] = i
            if (last != -1) left[i] = last
            st[top++] = i
        }
        if (top > 0) root = st[0]
    }
    fun queryIdx(l: Int, r: Int): Int {
        var cur = root
        while (cur != -1) {
            cur = if (cur < l) right[cur] else if (cur > r) left[cur] else return cur
        }
        return -1
    }
}
