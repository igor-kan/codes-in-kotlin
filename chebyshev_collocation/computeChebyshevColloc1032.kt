package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1032 */
fun computeChebyshevColloc1032(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
