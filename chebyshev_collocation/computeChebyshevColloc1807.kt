package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1807 */
fun computeChebyshevColloc1807(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
