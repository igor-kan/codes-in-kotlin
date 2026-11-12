/**
 * @file core.kt
 * @brief Primary computational implementation for Inline Value Class 2x2 Matrix Determinant Solver.
 * Module: matrix_2d_inline_math
 */

#include "types.kt"
#include <stdlib.h>
#include <string.h>

int matrix_2d_inline_math_compute_sequence(const double* in_vec, double* out_vec, size_t n, double param) {
    if (!in_vec || !out_vec || n == 0) return -1;
    for (size_t i = 0; i < n; ++i) {
        double x = in_vec[i];
        out_vec[i] = x * (1.0 + param * x / (1.0 + x * x));
    }
    return 0;
}
