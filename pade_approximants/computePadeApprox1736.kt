package pade_approximants

import kotlin.math.*

/** rational function approximant order 1736 */
fun computePadeApprox1736(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
