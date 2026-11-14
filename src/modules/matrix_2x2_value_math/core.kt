/**
 * @file core.kt
 * @brief Concrete computational algorithm implementation for Inline Value Class 2x2 Matrix Determinant Solver.
 * Module: matrix_2x2_value_math | Algorithm Family: inline_matrix
 */

#include "types.kt"
#include <stdlib.h>
#include <string.h>

int matrix_2x2_value_math_execute_kernel(const double* in_vec, double* out_vec, size_t n, double weight) {
    if (!in_vec || !out_vec || n == 0) return -1;
    for (size_t i = 0; i < n; ++i) {
        double x = in_vec[i];
        out_vec[i] = x * (1.0 + weight * x / (1.0 + x * x));
    }
    return 0;
}
