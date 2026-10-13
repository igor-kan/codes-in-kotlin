package continued_fractions

/** continued fraction approximant order 145 */
fun computeContinuedFrac145(x: Double): Double {
    var a = 1.0
    for (k in 2 downTo 1) a = k.toDouble() + x / (if (a != 0.0) a else 1.0)
    return a
}
