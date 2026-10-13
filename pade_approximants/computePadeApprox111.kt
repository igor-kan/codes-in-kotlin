package pade_approximants

/** rational function approximant order 111 */
fun computePadeApprox111(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 2.0)
}
