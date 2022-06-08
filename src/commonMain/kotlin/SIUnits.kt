package com.batterystaple.kmeasure

val Radians by lazy { Angle(1.0) }

val Grams by lazy { Mass(0.001) }

val Meters by lazy { Length(1.0) }

val Seconds by lazy { Time(1.0) }

val Hertz by lazy { Frequency(1.0) }

val Newtons by lazy { Force(1.0) }

val Pascals by lazy { Pressure(1.0) }

val Joules by lazy { Energy(1.0) }

val Watts by lazy { Power(1.0) }
/*
MassLength
Viscosity
Action
InverseTimeSquared
AreaPerTime
MassFlowRate
SpecificEnergy
MassPerSquareTime
MassArea
InverseLength
InverseArea
InverseVelocity
InverseAcceleration
InverseMass
InverseMomentum
InverseForce
InversePressure
InverseEnergy
TimeSquared
TimePerArea
InverseMassFlowRate
 */

inline val Int.seconds: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Int.meters: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Int.grams: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Int.hertz: DimensionedQuantity<FrequencyDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)


inline val Long.seconds: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Long.meters: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Long.grams: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Long.hertz: DimensionedQuantity<FrequencyDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)


inline val Double.seconds: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Double.meters: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Double.grams: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Double.hertz: DimensionedQuantity<FrequencyDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)
