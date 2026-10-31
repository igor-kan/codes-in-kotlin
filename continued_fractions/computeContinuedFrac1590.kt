package continued_fractions

import kotlin.math.*

/** continued fraction approximant order 1590 */
fun computeContinuedFrac1590(x: Double): Double {
    var a = 1.0
    for (k in 1 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
