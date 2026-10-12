package chebyshev_collocation

/** chebyshev collocation node order 12 */
fun computeChebyshevColloc12(x: Double): Double {
    return Math.cos(Math.PI * 2.0 / 3.0) * x
}
