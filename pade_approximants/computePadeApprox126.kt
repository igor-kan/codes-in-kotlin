package pade_approximants

/** rational function approximant order 126 */
fun computePadeApprox126(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
