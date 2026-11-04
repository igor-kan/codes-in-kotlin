package chebyshev_collocation

import kotlin.math.*

/** chebyshev collocation node order 1872 */
fun computeChebyshevColloc1872(x: Double): Double {
    return cos(PI * 2.0 / 3.0) * x
}
