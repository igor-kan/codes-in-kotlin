package modules.channel_flow_pipeline

/**
 * Core type definitions and data classes for Backpressure-Aware Reactive Coroutine Flow Pipeline.
 * Module: channel_flow_pipeline
 */
object ModuleTypes {
    const val ALIGNMENT: Int = 64

    data class Config(
        val capacity: Int = 1024,
        val tolerance: Double = 1e-12,
        val maxIterations: Int = 1000
    )

    sealed class Result<out T> {
        data class Success<out T>(val value: T) : Result<T>()
        data class Error(val message: String, val code: Int) : Result<Nothing>()
    }

    class Context(val config: Config = Config()) {
        var operationsCount: Long = 0L
            internal set

        fun recordOperation() {
            operationsCount++
        }
    }
}
