package fibonacci_matrix_power

import kotlin.math.*

/** fibonacci matrix power recurrence order 1403 */
fun computeFibonacciMatrix1403(x: Double): Double {
    var f0 = 1.0
    var f1 = 1.0
    for (i in 0 until 12) { val nx = f0 + f1 * x * 0.1; f0 = f1; f1 = nx }
    return f1
}
