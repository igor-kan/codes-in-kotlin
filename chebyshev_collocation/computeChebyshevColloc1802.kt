package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1802 */
fun computeChebyshevColloc1802(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
