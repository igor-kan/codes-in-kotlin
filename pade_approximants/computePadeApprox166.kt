package pade_approximants

/** rational function approximant order 166 */
fun computePadeApprox166(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 1.0)
}
