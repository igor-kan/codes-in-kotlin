package com.igorkan.modules.knapsack_bounded_monotone_kt

class MonotoneDequeKnapsack : BoundedKnapsackContract {
    override fun optimize(lots: List<BoundedLot>, capacity: Int): KnapsackSummary {
        validateBoundedInput(lots, capacity)
        val dp = LongArray(capacity + 1)
        val dqIdx = IntArray(capacity + 1)
        val dqVal = LongArray(capacity + 1)

        for (lot in lots) {
            val w = lot.weight
            val v = lot.value
            val cnt = minOf(lot.count, capacity / w)
            if (cnt <= 0) continue

            for (rem in 0 until w) {
                var head = 0
                var tail = 0
                var step = 0
                var cap = rem
                while (cap <= capacity) {
                    val shifted = dp[cap] - step.toLong() * v
                    while (tail > head && dqVal[tail - 1] <= shifted) tail--
                    dqIdx[tail] = step
                    dqVal[tail] = shifted
                    tail++
                    if (step - dqIdx[head] > cnt) head++
                    dp[cap] = dqVal[head] + step.toLong() * v
                    step++
                    cap += w
                }
            }
        }
        return KnapsackSummary(dp[capacity], capacity)
    }
}
