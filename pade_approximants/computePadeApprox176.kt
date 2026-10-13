package pade_approximants

/** rational function approximant order 176 */
fun computePadeApprox176(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
