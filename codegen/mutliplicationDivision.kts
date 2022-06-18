data class Dimension(val mass: Int, val length: Int, val time: Int) {

    private fun Int.typeName(): String =
        if (this >= 0) this.toString() else "N${this.toString().substring(startIndex = 1)}"

    val typeName: String get() =
        dimensionsToNames[this]
            ?: "DimensionedQuantity<CompositeDimension<Mass${mass.typeName()}, Length${length.typeName()}, Time${time.typeName()}>>"

    fun toJvmNameString(): String =
        "m${mass}l${length}t${time}"

    operator fun times(other: Dimension): Dimension =
        Dimension(
            mass = this.mass + other.mass,
            length = this.length + other.length,
            time = this.time + other.time
        )

    operator fun div(other: Dimension): Dimension =
        Dimension(
            mass = this.mass - other.mass,
            length = this.length - other.length,
            time = this.time - other.time
        )
}

val commonDimensions = listOf(
    Dimension(0, 0, 0),
    Dimension(0, 0, 1),
    Dimension(0, 0, -1),
    Dimension(0, 1, 0),
    Dimension(0, 2, 0),
    Dimension(0, 3, 0),
    Dimension(1, -3, 0),
    Dimension(0, 1, -1),
    Dimension(0, 1, -2),
    Dimension(1, 0, 0),
    Dimension(1, 1, -1),
    Dimension(1, 1, -2),
    Dimension(1, -1, -2),
    Dimension(1, 2, -2),
    Dimension(1, 2, -3),
    Dimension(0, 0, 2),
    Dimension(0, 0, 3),
    Dimension(0, 0, -2),
    Dimension(0, 0, -3),
    Dimension(0, -1, 0),
    Dimension(0, -2, 0),
    Dimension(0, -3, 0),
)

val dimensionsToNames by lazy {
    mapOf(
        Dimension(0, 0, 0) to "Scalar",
        Dimension(0, 0, 1) to "Time",
        Dimension(0, 0, -1) to "Frequency",
        Dimension(0, 1, 0) to "Length",
        Dimension(0, 2, 0) to "Area",
        Dimension(0, 3, 0) to "Volume",
        Dimension(1, -3, 0) to "Density",
        Dimension(0, 1, -1) to "Velocity",
        Dimension(0, 1, -2) to "Acceleration",
        Dimension(1, 0, 0) to "Mass",
        Dimension(1, 1, -1) to "Momentum",
        Dimension(1, 1, -2) to "Force",
        Dimension(1, -1, -2) to "Pressure",
        Dimension(1, 2, -2) to "Energy",
        Dimension(1, 2, -3) to "Power",

        Dimension(0, 0, 2) to "SquareTime",
        Dimension(0, 1, 1) to "Absment",
        Dimension(0, 2, 1) to "AreaTime",
        Dimension(1, 0, 1) to "MassTime",
        Dimension(1, 1, 0) to "MassLength",
        Dimension(1, -1, -1) to "Viscosity",
        Dimension(1, 2, -1) to "Action",
        Dimension(0, 0, -2) to "InverseTimeSquared",
        Dimension(0, 2, -2) to "AreaPerTime",
        Dimension(1, 0, -1) to "MassFlowRate",
        Dimension(0, -2, -2) to "SpecificEnergy",
        Dimension(1, 0, -2) to "MassPerSquareTime",
        Dimension(1, 2, 0) to "MassArea",
        Dimension(0, -1, 0) to "InverseLength",

        Dimension(0, -2, 0) to "InverseArea",
        Dimension(0, -1, 1) to "InverseVelocity",
        Dimension(0, -1, 2) to "InverseAcceleration",
        Dimension(-1, 0, 0) to "InverseMass",
        Dimension(-1, -1, 1) to "InverseMomentum",
        Dimension(-1, -1, 2) to "InverseForce",
        Dimension(-1, 1, 2) to "InversePressure",
        Dimension(-1, -2, 2) to "InverseEnergy",
        Dimension(0, 0, 2) to "TimeSquared",
        Dimension(0, -2, 1) to "TimePerArea",
        Dimension(-1, 0, 1) to "InverseMassFlowRate",
    )
}

sealed class Operation {
    abstract val name: String
    abstract val symbol: String
    abstract fun returnDimension(receiver: Dimension, parameter: Dimension): Dimension

    object Product : Operation() {
        override val name: String = "times"
        override val symbol: String = "*"

        override fun returnDimension(receiver: Dimension, parameter: Dimension): Dimension =
            receiver * parameter
    }
    object Division : Operation() {
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

fun main() {
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
                        body = " = DimensionedQuantity(siValue ${operation.symbol} other.siValue)"
                    )
                )
            }
        }
    }
}

