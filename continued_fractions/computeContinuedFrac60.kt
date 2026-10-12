package continued_fractions

/** continued fraction approximant order 60 */
fun computeContinuedFrac60(x: Double): Double {
    var a = 1.0
    for (k in 1 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
