package pade_approximants

import kotlin.math.*

/** rational function approximant order 626 */
fun computePadeApprox626(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
