package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1402 */
fun computeChebyshevColloc1402(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
