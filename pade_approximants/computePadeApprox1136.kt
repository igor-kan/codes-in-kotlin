package pade_approximants

import kotlin.math.*

/** rational function approximant order 1136 */
fun computePadeApprox1136(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
