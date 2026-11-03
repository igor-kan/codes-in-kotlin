package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1792 */
fun computeChebyshevColloc1792(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
