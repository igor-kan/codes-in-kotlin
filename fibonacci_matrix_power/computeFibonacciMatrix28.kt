package fibonacci_matrix_power

/** fibonacci matrix power recurrence order 28 */
fun computeFibonacciMatrix28(x: Double): Double {
    var f0 = 1.0; var f1 = 1.0
    for (i in 0 until 5) { val nx = f0 + f1 * x * 0.1; f0 = f1; f1 = nx }
    return f1
}
