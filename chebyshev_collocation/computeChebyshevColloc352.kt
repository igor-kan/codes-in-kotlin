package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 352 */
fun computeChebyshevColloc352(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
