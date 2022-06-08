package com.batterystaple.kmeasure

import kotlin.math.PI

// Angles
val Degrees by lazy { Angle(PI / 180.0) }
val Revolutions by lazy { Angle(2 * PI) }
val Rotations by lazy { Revolutions }

// Time
internal const val SECONDS_PER_MINUTE = 60.0
internal const val SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60.0
internal const val SECONDS_PER_DAY = SECONDS_PER_HOUR * 24.0
internal const val SECONDS_PER_YEAR = SECONDS_PER_DAY * 365

val Minutes by lazy { Time(SECONDS_PER_MINUTE) }
val Hours by lazy { Time(SECONDS_PER_HOUR) }
val Days by lazy { Time(SECONDS_PER_DAY) }
val Weeks by lazy { Time(SECONDS_PER_DAY * 7) }
val Years by lazy { Time(SECONDS_PER_YEAR) }
val Decades by lazy { Time(SECONDS_PER_YEAR * 10) }
val Centuries by lazy { Time(SECONDS_PER_YEAR * 100) }

// Mass
val Tonnes by lazy { Mass(1000.0)}

// Area
val Hectares by lazy { Area(10_000.0) }

// Volume
val Liters by lazy { Volume(0.001) }

// Energy
val ElectronVolt by lazy { Energy(1.602176634E-19) }

inline val Int.degrees: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Degrees)
inline val Int.revolutions: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Revolutions)
inline val Int.rotations: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Rotations)

inline val Int.minutes: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Minutes)
inline val Int.hours: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Hours)
inline val Int.days: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Days)
inline val Int.weeks: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Weeks)
inline val Int.years: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Years)
inline val Int.decades: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Decades)


inline val Double.degrees: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Degrees)
inline val Double.revolutions: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Revolutions)
inline val Double.rotations: DimensionedQuantity<AngleDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Rotations)

inline val Double.minutes: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Minutes)
inline val Double.hours: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Hours)
inline val Double.days: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Days)
inline val Double.weeks: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Weeks)
inline val Double.years: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Years)
inline val Double.decades: DimensionedQuantity<TimeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Decades)