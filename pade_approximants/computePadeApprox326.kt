package pade_approximants

import kotlin.math.*

/** rational function approximant order 326 */
fun computePadeApprox326(x: Double): Double {
    return (1.0 + x * 3.0) / (1.0 + x * x * 1.0)
}
