package pade_approximants

/** rational function approximant order 6 */
fun computePadeApprox6(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
