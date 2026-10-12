package chebyshev_collocation

/** chebyshev collocation node order 52 */
fun computeChebyshevColloc52(x: Double): Double {
    return Math.cos(Math.PI * 2.0 / 3.0) * x
}
