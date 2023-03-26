@file:Suppress("unused")
package com.batterystaple.kmeasure.units

import com.batterystaple.kmeasure.quantities.*
import kotlin.internal.InlineOnly
import kotlin.math.PI

// Angles
val degrees by lazy { Angle(PI / 180.0) }
val revolutions by lazy { Angle(2 * PI) }
val rotations by lazy { revolutions }

// Time
internal const val SECONDS_PER_MINUTE = 60.0
internal const val SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60.0
internal const val SECONDS_PER_DAY = SECONDS_PER_HOUR * 24.0
internal const val SECONDS_PER_YEAR = SECONDS_PER_DAY * 365

val minutes by lazy { Time(SECONDS_PER_MINUTE) }
val hours by lazy { Time(SECONDS_PER_HOUR) }
val days by lazy { Time(SECONDS_PER_DAY) }
val weeks by lazy { Time(SECONDS_PER_DAY * 7) }
val years by lazy { Time(SECONDS_PER_YEAR) }
val decades by lazy { Time(SECONDS_PER_YEAR * 10) }
val centuries by lazy { Time(SECONDS_PER_YEAR * 100) }

// Mass
val tonnes by lazy { Mass(1000.0)}

// Area
val hectares by lazy { Area(10_000.0) }

// Volume
val liters by lazy { Volume(0.001) }

// Charge
val elementaryCharges by lazy { Charge(1.602176634E-19) }

// Energy
val electronVolts by lazy { Energy(1.602176634E-19) }

inline val Int.degrees: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.degrees)
inline val Int.revolutions: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.revolutions)
inline val Int.rotations: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.rotations)

inline val Int.minutes: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.minutes)
inline val Int.hours: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hours)
inline val Int.days: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.days)
inline val Int.weeks: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.weeks)
inline val Int.years: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.years)
inline val Int.decades: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.decades)
inline val Int.centuries: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.centuries)

inline val Int.tonnes: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tonnes)

inline val Int.hectares: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hectares)

inline val Int.liters: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.liters)

inline val Int.electronVolts: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.electronVolts)

inline val Int.elementaryCharges: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.elementaryCharges)


inline val Long.degrees: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.degrees)
inline val Long.revolutions: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.revolutions)
inline val Long.rotations: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.rotations)

inline val Long.minutes: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.minutes)
inline val Long.hours: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hours)
inline val Long.days: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.days)
inline val Long.weeks: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.weeks)
inline val Long.years: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.years)
inline val Long.decades: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.decades)
inline val Long.centuries: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.centuries)

inline val Long.tonnes: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tonnes)

inline val Long.hectares: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hectares)

inline val Long.liters: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.liters)

inline val Long.electronVolts: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.electronVolts)

inline val Long.elementaryCharges: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.elementaryCharges)


inline val Double.degrees: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.degrees)
inline val Double.revolutions: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.revolutions)
inline val Double.rotations: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.rotations)

inline val Double.minutes: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.minutes)
inline val Double.hours: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hours)
inline val Double.days: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.days)
inline val Double.weeks: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.weeks)
inline val Double.years: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.years)
inline val Double.decades: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.decades)
inline val Double.centuries: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.centuries)

inline val Double.tonnes: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tonnes)

inline val Double.hectares: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hectares)

inline val Double.liters: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.liters)

inline val Double.electronVolts: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.electronVolts)

inline val Double.elementaryCharges: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.elementaryCharges)