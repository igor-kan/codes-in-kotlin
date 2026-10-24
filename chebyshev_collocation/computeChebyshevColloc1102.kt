package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1102 */
fun computeChebyshevColloc1102(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
