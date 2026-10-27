package pade_approximants

import kotlin.math.*

/** rational function approximant order 1321 */
fun computePadeApprox1321(x: Double): Double {
    return (1.0 + x * 2.0) / (1.0 + x * x * 2.0)
}
