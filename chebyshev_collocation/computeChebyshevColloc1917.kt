package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1917 */
fun computeChebyshevColloc1917(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
