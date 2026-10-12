package pade_approximants

/** rational function approximant order 41 */
fun computePadeApprox41(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 2.0)
}
