package pade_approximants

/** rational function approximant order 36 */
fun computePadeApprox36(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
