package pade_approximants

/** rational function approximant order 66 */
fun computePadeApprox66(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
