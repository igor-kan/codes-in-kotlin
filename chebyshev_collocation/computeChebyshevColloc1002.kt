package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1002 */
fun computeChebyshevColloc1002(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
