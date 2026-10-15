package pade_approximants

import kotlin.math.*

/** rational function approximant order 306 */
fun computePadeApprox306(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
