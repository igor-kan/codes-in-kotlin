package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1927 */
fun computeChebyshevColloc1927(x: Double): Double {
    return cos(PI * 7.0 / 8.0) * x
}
