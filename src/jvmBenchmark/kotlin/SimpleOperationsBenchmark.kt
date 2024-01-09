package benchmark

import com.batterystaple.kmeasure.units.seconds
import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@Suppress("UNUSED")
@State(Scope.Benchmark)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
class SimpleOperationsBenchmark {
    @Benchmark
    fun doNothing(): Double {
        return 1.0
    }

    @Benchmark
    fun addSameUnit(): Double {
        val first = 1.seconds
        val second = 2.seconds
        return (first + second).siValue
    }

    @Benchmark
    fun addDouble(): Double {
        val first = 1.0
        val second = 2.0
        return first + second
    }

    @Benchmark
    fun multiplySameUnit(): Double {
        val first = 1.seconds
        val second = 2.seconds
        return (first + second).siValue
    }

    @Benchmark
    fun multiplyDouble(): Double {
        val first = 1.0
        val second = 2.0
        return first + second
    }
}