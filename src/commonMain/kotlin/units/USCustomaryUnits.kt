@file:Suppress("unused")
package com.batterystaple.kmeasure.units

import com.batterystaple.kmeasure.quantities.*
import kotlin.internal.InlineOnly

// Mass
internal const val KILOGRAMS_PER_POUND_MASS = 0.453_592_37

val ounces by lazy { Mass(KILOGRAMS_PER_POUND_MASS / 16) }
val pounds by lazy { Mass(KILOGRAMS_PER_POUND_MASS) }
val tons by lazy { Mass(KILOGRAMS_PER_POUND_MASS * 2000) }
val longTons by lazy { Mass(KILOGRAMS_PER_POUND_MASS * 2240) }

// Length
internal const val METERS_PER_INCH = 0.0254
internal const val METERS_PER_FOOT = METERS_PER_INCH * 12
internal const val METERS_PER_SURVEY_FOOT = 1200.0/3937.0

val mils by lazy { Length(METERS_PER_INCH / 1_000) }
inline val thous get() = mils
val inches by lazy { Length(METERS_PER_INCH) }
val feet by lazy { Length(METERS_PER_FOOT) }
val surveyFeet by lazy { Length(METERS_PER_SURVEY_FOOT) }
val yards by lazy { Length(METERS_PER_FOOT * 3) }
val miles by lazy { Length(METERS_PER_FOOT * 5280) }

// Area
val acres by lazy { Area(43560 * METERS_PER_SURVEY_FOOT) }

// Volume
internal const val CUBIC_METERS_PER_US_FLUID_OUNCE = 29.573_529_562_5

val teaspoons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE / 6) }
val tablespoons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE / 2) }
val fluidOunces by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE) }
val cups by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 8) }
val pints by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 16) }
val quarts by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 32) }
val gallons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 128) }

// Force
internal const val NEWTONS_PER_POUND_FORCE = 4.4482216152605

val poundForce by lazy { Force(NEWTONS_PER_POUND_FORCE) }

// Power
val horsepower by lazy { Power(33_000.0 * METERS_PER_FOOT * NEWTONS_PER_POUND_FORCE / SECONDS_PER_MINUTE) }


inline val Int.ounces: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ounces)
inline val Int.pounds: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pounds)
inline val Int.tons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tons)
inline val Int.longTons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.longTons)

inline val Int.mils: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mils)
inline val Int.thous: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.thous)
inline val Int.inches: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.inches)
inline val Int.feet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.feet)
inline val Int.surveyFeet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.surveyFeet)
inline val Int.yards: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.yards)
inline val Int.miles: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.miles)

inline val Int.acres: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.acres)

inline val Int.teaspoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teaspoons)
inline val Int.tablespoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tablespoons)
inline val Int.fluidOunces: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.fluidOunces)
inline val Int.cups: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.cups)
inline val Int.pints: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pints)
inline val Int.quarts: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.quarts)
inline val Int.gallons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.gallons)

inline val Int.poundForce: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.poundForce)

inline val Int.horsepower: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.horsepower)


inline val Long.ounces: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ounces)
inline val Long.pounds: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pounds)
inline val Long.tons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tons)
inline val Long.longTons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.longTons)

inline val Long.mils: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mils)
inline val Long.thous: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.thous)
inline val Long.inches: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.inches)
inline val Long.feet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.feet)
inline val Long.surveyFeet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.surveyFeet)
inline val Long.yards: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.yards)
inline val Long.miles: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.miles)

inline val Long.acres: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.acres)

inline val Long.teaspoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teaspoons)
inline val Long.tablespoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tablespoons)
inline val Long.fluidOunces: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.fluidOunces)
inline val Long.cups: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.cups)
inline val Long.pints: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pints)
inline val Long.quarts: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.quarts)
inline val Long.gallons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.gallons)

inline val Long.poundForce: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.poundForce)

inline val Long.horsepower: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.horsepower)


inline val Double.ounces: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ounces)
inline val Double.pounds: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pounds)
inline val Double.tons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tons)
inline val Double.longTons: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.longTons)

inline val Double.mils: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mils)
inline val Double.thous: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.thous)
inline val Double.inches: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.inches)
inline val Double.feet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.feet)
inline val Double.surveyFeet: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.surveyFeet)
inline val Double.yards: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.yards)
inline val Double.miles: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.miles)

inline val Double.acres: Area @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.acres)

inline val Double.teaspoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teaspoons)
inline val Double.tablespoons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.tablespoons)
inline val Double.fluidOunces: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.fluidOunces)
inline val Double.cups: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.cups)
inline val Double.pints: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pints)
inline val Double.quarts: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.quarts)
inline val Double.gallons: Volume @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.gallons)

inline val Double.poundForce: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.poundForce)

inline val Double.horsepower: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.horsepower)