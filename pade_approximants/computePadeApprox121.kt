package pade_approximants

/** rational function approximant order 121 */
fun computePadeApprox121(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 2.0)
}
