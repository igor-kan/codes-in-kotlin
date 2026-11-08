package modules.structured_supervisor_job

/**
 * Core computational implementation for Fault-Tolerant SupervisorJob with Localized Restarts.
 * Module: structured_supervisor_job
 */
class CoreEngine(val config: ModuleTypes.Config = ModuleTypes.Config()) {
    val context = ModuleTypes.Context(config)

    fun compute(input: DoubleArray, output: DoubleArray, n: Int): Int {
        require(n in 1..input.size && n <= output.size) { "Invalid buffer sizes" }
        for (i in 0 until n) {
            val x = input[i]
            output[i] = x * (1.0 + 0.5 * x - 0.125 * x * x)
        }
        context.recordOperation()
        return n
    }
}
