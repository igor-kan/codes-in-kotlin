package pade_approximants

/** rational function approximant order 16 */
fun computePadeApprox16(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 1.0)
}
