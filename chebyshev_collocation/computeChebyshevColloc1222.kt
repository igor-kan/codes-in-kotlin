package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1222 */
fun computeChebyshevColloc1222(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
