package com.igorkan.modules.patience_lis_solver

fun validateSequenceNonEmpty(nums: IntArray) {
    requirePatience(nums.isNotEmpty()) { "input array empty" }
    for (v in nums) {
        requirePatience(v != Int.MIN_VALUE) { "reserved sentinel encountered" }
    }
}
