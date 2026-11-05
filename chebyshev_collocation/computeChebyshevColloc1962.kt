package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1962 */
fun computeChebyshevColloc1962(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
