package com.igorkan.modules.patience_lis_solver

fun verifyLisStrict(nums: IntArray, res: LisResult) {
    requirePatience(res.length == res.values.size && res.length == res.indices.size) { "length mismatch" }
    for (k in 0 until res.length) {
        requirePatience(nums[res.indices[k]] == res.values[k]) { "value/index mismatch" }
        if (k > 0) {
            requirePatience(res.indices[k - 1] < res.indices[k] && res.values[k - 1] < res.values[k]) {
                "subsequence not strictly increasing"
            }
        }
    }
}
