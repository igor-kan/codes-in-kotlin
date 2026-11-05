package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1937 */
fun computeChebyshevColloc1937(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
