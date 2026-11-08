package modules.native_arena_allocator

/**
 * Core computational implementation for Kotlin/Native Direct Scoped C-Memory Arena.
 * Module: native_arena_allocator
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
