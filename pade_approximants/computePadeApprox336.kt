package pade_approximants

import kotlin.math.*

/** rational function approximant order 336 */
fun computePadeApprox336(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
