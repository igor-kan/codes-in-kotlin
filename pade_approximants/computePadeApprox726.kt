package pade_approximants

import kotlin.math.*

/** rational function approximant order 726 */
fun computePadeApprox726(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
