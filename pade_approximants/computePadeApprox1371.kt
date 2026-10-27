package pade_approximants

import kotlin.math.*

/** rational function approximant order 1371 */
fun computePadeApprox1371(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 2.0)
}
