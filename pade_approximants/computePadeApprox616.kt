package pade_approximants

import kotlin.math.*

/** rational function approximant order 616 */
fun computePadeApprox616(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 1.0)
}
