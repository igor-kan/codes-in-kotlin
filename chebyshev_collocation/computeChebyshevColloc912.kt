package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 912 */
fun computeChebyshevColloc912(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
