package benchmark

import com.batterystaple.kmeasure.quantities.div
import com.batterystaple.kmeasure.quantities.times
import com.batterystaple.kmeasure.units.grams
import com.batterystaple.kmeasure.units.meters
import com.batterystaple.kmeasure.units.seconds
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole
import java.util.concurrent.TimeUnit

@Suppress("UNUSED")
@State(Scope.Benchmark)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
class ComplexOperationsBenchmark {

    @State(Scope.Benchmark)
    final class BenchmarkState {
        val initialPosition: Double = 2.42
        val finalPosition: Double = 8482.49
        val initialTime: Double = 49.0
        val finalTime: Double = 54.2
        val mass: Double = 82.984

        val initialPositionUnits = initialPosition.meters
        val finalPositionUnits = finalPosition.meters
        val initialTimeUnits = initialTime.seconds
        val finalTimeUnits = finalTime.seconds
    }

    @Benchmark
    fun doNothing(blackhole: Blackhole, state: BenchmarkState): Double {
        return 1.0
    }

    @Benchmark
    fun calculateComplexUnits(blackhole: Blackhole, state: BenchmarkState) {
        val initialPosition = state.initialPositionUnits
        val finalPosition = state.finalPositionUnits
        val initialTime = state.initialTimeUnits
        val finalTime = state.finalTimeUnits

        val dx = finalPosition - initialPosition
        blackhole.consume(dx)
        val dt = finalTime - initialTime
        blackhole.consume(dt)

        val acceleration = dx / dt / dt
        blackhole.consume(acceleration)
        val mass = state.mass.grams

        val force = mass * acceleration
        blackhole.consume(force)

        val energy = force * dx
        blackhole.consume(energy)
        val work = energy / dt

        blackhole.consume(work)
    }

    @Benchmark
    fun calculateComplexNoUnits(blackhole: Blackhole, state: BenchmarkState) {
        val initialPosition = state.initialPosition
        val finalPosition = state.finalPosition
        val initialTime = state.initialTime
        val finalTime = state.finalTime

        val dx = finalPosition - initialPosition
        blackhole.consume(dx)
        val dt = finalTime - initialTime
        blackhole.consume(dt)

        val acceleration = dx / dt / dt
        blackhole.consume(acceleration)
        val mass = state.mass

        val force = mass * acceleration
        blackhole.consume(force)

        val energy = force * dx
        blackhole.consume(energy)
        val work = energy / dt

        blackhole.consume(work)
    }
}

