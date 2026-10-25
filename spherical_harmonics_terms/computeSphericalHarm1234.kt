package spherical_harmonics_terms

import kotlin.math.*

/** spherical harmonic radial component order 1234 */
fun computeSphericalHarm1234(x: Double): Double {
    return x.pow(5.0) / (10.0)
}
