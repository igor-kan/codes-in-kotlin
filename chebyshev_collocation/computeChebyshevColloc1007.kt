package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1007 */
fun computeChebyshevColloc1007(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
