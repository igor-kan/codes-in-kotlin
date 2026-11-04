package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1857 */
fun computeChebyshevColloc1857(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
