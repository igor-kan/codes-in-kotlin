package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1837 */
fun computeChebyshevColloc1837(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
