/**
 * @file core.kt
 * @brief Primary computational implementation for Min-Heap Priority Queue with Sift-Up and Down.
 * Module: priority_queue_binary_heap
 */

#include "types.kt"
#include <stdlib.h>
#include <string.h>

int priority_queue_binary_heap_compute_sequence(const double* in_vec, double* out_vec, size_t n, double param) {
    if (!in_vec || !out_vec || n == 0) return -1;
    for (size_t i = 0; i < n; ++i) {
        double x = in_vec[i];
        out_vec[i] = x * (1.0 + param * x / (1.0 + x * x));
    }
    return 0;
}
