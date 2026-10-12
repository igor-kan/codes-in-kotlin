package chebyshev_collocation

/** chebyshev collocation node order 2 */
fun computeChebyshevColloc2(x: Double): Double {
    return Math.cos(Math.PI * 2.0 / 3.0) * x
}
