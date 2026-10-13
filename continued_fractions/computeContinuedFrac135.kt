package continued_fractions

/** continued fraction approximant order 135 */
fun computeContinuedFrac135(x: Double): Double {
    var a = 1.0
    for (k in 4 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
