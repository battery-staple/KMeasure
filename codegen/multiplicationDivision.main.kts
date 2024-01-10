import kotlin.time.measureTime

// region: shared
data class Dimension(val mass: Int, val length: Int, val time: Int, val current: Int) {

    private fun Int.typeName(): String =
        if (this >= 0) this.toString() else "N${this.toString().substring(startIndex = 1)}"

    val typeName: String get() =
        dimensionsToNames[this]
            ?: "Quantity<Dimension<Mass${mass.typeName()}, Length${length.typeName()}, Time${time.typeName()}, Current${current.typeName()}>>"

    fun toJvmNameString(): String =
        "m${mass}l${length}t${time}c${current}"

    operator fun times(other: Dimension): Dimension =
        Dimension(
            mass = this.mass + other.mass,
            length = this.length + other.length,
            time = this.time + other.time,
            current = this.current + other.current
        )

    operator fun div(other: Dimension): Dimension =
        Dimension(
            mass = this.mass - other.mass,
            length = this.length - other.length,
            time = this.time - other.time,
            current = this.current - other.current
        )
}

val commonDimensions = listOf(
    Dimension(0, 0, 0, 0), // Scalar
    Dimension(0, 0, 1, 0), // Time
    Dimension(0, 0, -1, 0), // Frequency
    Dimension(0, 1, 0, 0), // Length
    Dimension(0, 2, 0, 0), // Area
    Dimension(0, 3, 0, 0), // Volume
    Dimension(1, -3, 0, 0), // Density
    Dimension(0, 1, -1, 0), // Velocity
    Dimension(0, 1, -2, 0), // Acceleration
    Dimension(1, 0, 0, 0), // Mass
    Dimension(1, 1, -1, 0), // Momentum
    Dimension(1, 1, -2, 0), // Force
    Dimension(1, -1, -2, 0), // Pressure
    Dimension(1, 2, -2, 0), // Energy
    Dimension(1, 2, 0, 0), // MomentOfInertia
    Dimension(1, 2, -3, 0), // Power
    Dimension(0, 0, 0, 1), // Current
    Dimension(0, 0, 1, 1), // Charge
    Dimension(1, 2, -3, -1), // Electrical Potential
    Dimension(-1, -2, 4, 2), // Capacitance
    Dimension(1, 2, -3, -2), // Resistance
    Dimension(-1, -2, 3, 2), // Conductance
    Dimension(1, 2, -2, -1), // Magnetic Flux
    Dimension(1, 0, -2, -1), // Magnetic Flux Density
    Dimension(1, 2, -2, -2), // Inductance

    Dimension(0, 0, 2, 0), // SquareTime
    Dimension(0, 0, 3, 0), // CubicTime
    Dimension(0, 0, -2, 0), // InverseSquareTime
    Dimension(0, 0, -3, 0), // InverseCubicTime
    Dimension(0, -1, 0, 0), // InverseLength
    Dimension(0, -2, 0, 0), // InverseArea
    Dimension(0, -3, 0, 0), // InverseVolume
)

val dimensionsToNames by lazy {
    val dimensionsToNamesUnfiltered = arrayOf(
        Dimension(0, 0, 0, 0) to "Scalar",
        Dimension(0, 0, 1, 0) to "Time",
        Dimension(0, 0, -1, 0) to "Frequency",
        Dimension(0, 1, 0, 0) to "Length",
        Dimension(0, 2, 0, 0) to "Area",
        Dimension(0, 3, 0, 0) to "Volume",
        Dimension(1, -3, 0, 0) to "Density",
        Dimension(0, 1, -1, 0) to "Velocity",
        Dimension(0, 1, -2, 0) to "Acceleration",
        Dimension(1, 0, 0, 0) to "Mass",
        Dimension(1, 1, -1, 0) to "Momentum",
        Dimension(1, 1, -2, 0) to "Force",
        Dimension(1, -1, -2, 0) to "Pressure",
        Dimension(1, 2, -2, 0) to "Energy",
        Dimension(1, 2, -3, 0) to "Power",
        Dimension(0, 0, 0, 1) to "Current",
        Dimension(0, 0, 1, 1) to "Charge",
        Dimension(1, 2, -3, -1) to "ElectricalPotential",
        Dimension(-1, -2, 4, 2) to "Capacitance",
        Dimension(1, 2, -3, -2) to "Resistance",
        Dimension(-1, -2, 3, 2) to "Conductance",
        Dimension(1, 2, -2, -1) to "MagneticFlux",
        Dimension(1, 0, -2, -1) to "MagneticFluxDensity",
        Dimension(1, 2, -2, -2) to "Inductance",

        Dimension(0, 0, 2, 0) to "TimeSquared",
        Dimension(0, 1, 1, 0) to "Absment",
        Dimension(0, 2, 1, 0) to "AreaTime",
        Dimension(1, 0, 1, 0) to "MassTime",
        Dimension(1, 1, 0, 0) to "MassLength",
        Dimension(1, -1, -1, 0) to "Viscosity",
        Dimension(1, 2, -1, 0) to "Action",
        Dimension(0, 0, -2, 0) to "InverseTimeSquared",
        Dimension(1, 0, -1, 0) to "MassFlowRate",
        Dimension(0, 2, -2, 0) to "SpecificEnergy",
        Dimension(1, 0, -2, 0) to "MassPerSquareTime",
        Dimension(1, 2, 0, 0) to "MomentOfInertia",
        Dimension(1, -2, 0, 0) to "SurfaceDensity",
        Dimension(0, -2, 0, 1) to "CurrentDensity",
        Dimension(0, -1, 0, 1) to "MagneticFieldStrength",
        Dimension(1, 0, -3, 0) to "Irradiance",
        Dimension(1, 1, -3, -1) to "ElectricFieldStrength",
        Dimension(0, -3, 1, 1) to "ChargeDensity",
        Dimension(0, -2,  1, 1) to "SurfaceChargeDensity",
        Dimension(-1, -3, 4, 2) to "Permittivity",
        Dimension(1, 1, -2, -2) to "Permeability",

        Dimension(0, -1, 0, 0) to "InverseLength",
        Dimension(0, -2, 0, 0) to "InverseArea",
        Dimension(0, -1, 1, 0) to "InverseVelocity",
        Dimension(0, -1, 2, 0) to "InverseAcceleration",
        Dimension(-1, 0, 0, 0) to "InverseMass",
        Dimension(-1, -1, 1, 0) to "InverseMomentum",
        Dimension(-1, -1, 2, 0) to "InverseForce",
        Dimension(-1, 1, 2, 0) to "InversePressure",
        Dimension(-1, -2, 2, 0) to "InverseEnergy",
        Dimension(0, -2, 1, 0) to "TimePerArea",
        Dimension(-1, 0, 1, 0) to "InverseMassFlowRate",
    )

    // Ensure no accidental duplicates!
    run checkDuplicates@ {
        val uniqueKeys = dimensionsToNamesUnfiltered.map { it.first }.toSet()
        if (uniqueKeys.size == dimensionsToNamesUnfiltered.size) return@checkDuplicates

        for (key in uniqueKeys) {
            val duplicates = dimensionsToNamesUnfiltered.filter { it.first == key }
            if (duplicates.size != 1) error("Dimension $key with duplicate names ${duplicates.map { it.second }}")
        }
    }

    return@lazy mapOf(*dimensionsToNamesUnfiltered)
}

// endregion

// region: multiplicationDivision
sealed class Operation {
    abstract val name: String
    abstract val symbol: String
    abstract fun returnDimension(receiver: Dimension, parameter: Dimension): Dimension

    data object Product : Operation() {
        override val name: String = "times"
        override val symbol: String = "*"

        override fun returnDimension(receiver: Dimension, parameter: Dimension): Dimension =
            receiver * parameter
    }
    data object Division : Operation() {
        override val name: String = "div"
        override val symbol: String = "/"

        override fun returnDimension(receiver: Dimension, parameter: Dimension): Dimension =
            receiver / parameter
    }
}

class FunctionDeclaration(
    val annotations: List<String>,
    val modifiers: List<String>,
    val receiver: String,
    val functionName: String,
    val parameterName: String,
    val parameterType: String,
    val returnType: String,
    val body: String,
) {
    override fun toString(): String =
        "${annotations.joinToString(" ")} ${modifiers.joinToString(" ")} " +
                "fun $receiver.$functionName($parameterName: $parameterType): $returnType" +
                body
}

fun generateMultiplicationDivision() {
    println("Generating multiplication/division declarations:\n")

    var numGenerated = 0

    val runTime = measureTime {
        listOf(Operation.Product, Operation.Division).forEach { operation ->
            commonDimensions.forEach { receiver ->
                commonDimensions.forEach { parameter ->
                    println(
                        FunctionDeclaration(
                            annotations = listOf(
                                "@JvmName(\"${receiver.toJvmNameString()}${operation.name}${parameter.toJvmNameString()}\")",
                                "@kotlin.internal.InlineOnly"
                            ),
                            modifiers = listOf("inline", "operator"),
                            receiver = receiver.typeName,
                            functionName = operation.name,
                            parameterName = "other",
                            parameterType = parameter.typeName,
                            returnType = operation.returnDimension(receiver, parameter).typeName,
                            body = " = Quantity(siValue ${operation.symbol} other.siValue)"
                        )
                    )

                    numGenerated++
                }
            }
        }
    }

    println("\n")
    println("Generated $numGenerated function declarations from ${commonDimensions.size} dimensions in ${runTime}.")
}
// endregion
generateMultiplicationDivision()
