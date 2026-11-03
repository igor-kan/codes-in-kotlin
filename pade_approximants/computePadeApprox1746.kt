package pade_approximants

import kotlin.math.*

/** rational function approximant order 1746 */
fun computePadeApprox1746(x: Double): Double {
    return (1.0 + x * 1.0) / (1.0 + x * x * 1.0)
}
