package pade_approximants

/** rational function approximant order 61 */
fun computePadeApprox61(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 2.0)
}
