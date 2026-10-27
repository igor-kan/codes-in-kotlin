package pade_approximants

import kotlin.math.*

/** rational function approximant order 1356 */
fun computePadeApprox1356(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
