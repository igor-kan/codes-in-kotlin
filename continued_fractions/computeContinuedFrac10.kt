package continued_fractions

/** continued fraction approximant order 10 */
fun computeContinuedFrac10(x: Double): Double {
    var a = 1.0
    for (k in 5 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
