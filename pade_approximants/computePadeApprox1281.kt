package pade_approximants

import kotlin.math.*

/** rational function approximant order 1281 */
fun computePadeApprox1281(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 2.0)
}
