package continued_fractions

import kotlin.math.*

/** continued fraction approximant order 1580 */
fun computeContinuedFrac1580(x: Double): Double {
    var a = 1.0
    for (k in 3 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
