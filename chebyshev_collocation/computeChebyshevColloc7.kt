package chebyshev_collocation

/** chebyshev collocation node order 7 */
fun computeChebyshevColloc7(x: Double): Double {
    return Math.cos(Math.PI * 7.0 / 8.0) * x
}
