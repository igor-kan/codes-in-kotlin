package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1212 */
fun computeChebyshevColloc1212(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
