package pade_approximants

/** rational function approximant order 26 */
fun computePadeApprox26(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
