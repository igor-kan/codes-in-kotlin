package pade_approximants

import kotlin.math.*

/** rational function approximant order 1271 */
fun computePadeApprox1271(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 2.0)
}
