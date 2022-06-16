@file:Suppress("unused")
package com.batterystaple.kmeasure.units

import com.batterystaple.kmeasure.quantities.*
import kotlin.internal.InlineOnly

// Mass
internal const val KILOGRAMS_PER_POUND_MASS = 0.453_592_37

val Ounces by lazy { Mass(KILOGRAMS_PER_POUND_MASS / 16) }
val Pounds by lazy { Mass(KILOGRAMS_PER_POUND_MASS) }
val Tons by lazy { Mass(KILOGRAMS_PER_POUND_MASS * 2000) }
val LongTons by lazy { Mass(KILOGRAMS_PER_POUND_MASS * 2240) }

// Length
internal const val METERS_PER_INCH = 0.0254
internal const val METERS_PER_FOOT = METERS_PER_INCH * 12
internal const val METERS_PER_SURVEY_FOOT = 1200.0/3937.0

val Mils by lazy { Length(METERS_PER_INCH / 1_000) }
inline val Thous get() = Mils
val Inches by lazy { Length(METERS_PER_INCH) }
val Feet by lazy { Length(METERS_PER_FOOT) }
val SurveyFeet by lazy { Length(METERS_PER_SURVEY_FOOT) }
val Yards by lazy { Length(METERS_PER_FOOT * 3) }
val Miles by lazy { Length(METERS_PER_FOOT * 5280) }

// Area
val Acres by lazy { Area(43560 * METERS_PER_SURVEY_FOOT) }

// Volume
internal const val CUBIC_METERS_PER_US_FLUID_OUNCE = 29.573_529_562_5

val Teaspoons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE / 6) }
val Tablespoons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE / 2) }
val FluidOunces by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE) }
val Cups by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 8) }
val Pints by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 16) }
val Quarts by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 32) }
val Gallons by lazy { Volume(CUBIC_METERS_PER_US_FLUID_OUNCE * 128) }

// Force
internal const val NEWTONS_PER_POUND_FORCE = 4.4482216152605

val PoundForce by lazy { Force(NEWTONS_PER_POUND_FORCE) }

// Power
val Horsepower by lazy { Power(33_000.0 * METERS_PER_FOOT * NEWTONS_PER_POUND_FORCE / SECONDS_PER_MINUTE) }


inline val Int.ounces: Mass @InlineOnly inline get() = ofUnit(Ounces)
inline val Int.pounds: Mass @InlineOnly inline get() = ofUnit(Pounds)
inline val Int.tons: Mass @InlineOnly inline get() = ofUnit(Tons)
inline val Int.longTons: Mass @InlineOnly inline get() = ofUnit(LongTons)

inline val Int.mils: Length @InlineOnly inline get() = ofUnit(Mils)
inline val Int.thous: Length @InlineOnly inline get() = ofUnit(Thous)
inline val Int.inches: Length @InlineOnly inline get() = ofUnit(Inches)
inline val Int.feet: Length @InlineOnly inline get() = ofUnit(Feet)
inline val Int.surveyFeet: Length @InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Int.yards: Length @InlineOnly inline get() = ofUnit(Yards)
inline val Int.miles: Length @InlineOnly inline get() = ofUnit(Miles)

inline val Int.acres: Area @InlineOnly inline get() = ofUnit(Acres)

inline val Int.teaspoons: Volume @InlineOnly inline get() = ofUnit(Teaspoons)
inline val Int.tablespoons: Volume @InlineOnly inline get() = ofUnit(Tablespoons)
inline val Int.fluidOunces: Volume @InlineOnly inline get() = ofUnit(FluidOunces)
inline val Int.cups: Volume @InlineOnly inline get() = ofUnit(Cups)
inline val Int.pints: Volume @InlineOnly inline get() = ofUnit(Pints)
inline val Int.quarts: Volume @InlineOnly inline get() = ofUnit(Quarts)
inline val Int.gallons: Volume @InlineOnly inline get() = ofUnit(Gallons)

inline val Int.poundForce: Force @InlineOnly inline get() = ofUnit(PoundForce)

inline val Int.horsepower: Power @InlineOnly inline get() = ofUnit(Horsepower)


inline val Long.ounces: Mass @InlineOnly inline get() = ofUnit(Ounces)
inline val Long.pounds: Mass @InlineOnly inline get() = ofUnit(Pounds)
inline val Long.tons: Mass @InlineOnly inline get() = ofUnit(Tons)
inline val Long.longTons: Mass @InlineOnly inline get() = ofUnit(LongTons)

inline val Long.mils: Length @InlineOnly inline get() = ofUnit(Mils)
inline val Long.thous: Length @InlineOnly inline get() = ofUnit(Thous)
inline val Long.inches: Length @InlineOnly inline get() = ofUnit(Inches)
inline val Long.feet: Length @InlineOnly inline get() = ofUnit(Feet)
inline val Long.surveyFeet: Length @InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Long.yards: Length @InlineOnly inline get() = ofUnit(Yards)
inline val Long.miles: Length @InlineOnly inline get() = ofUnit(Miles)

inline val Long.acres: Area @InlineOnly inline get() = ofUnit(Acres)

inline val Long.teaspoons: Volume @InlineOnly inline get() = ofUnit(Teaspoons)
inline val Long.tablespoons: Volume @InlineOnly inline get() = ofUnit(Tablespoons)
inline val Long.fluidOunces: Volume @InlineOnly inline get() = ofUnit(FluidOunces)
inline val Long.cups: Volume @InlineOnly inline get() = ofUnit(Cups)
inline val Long.pints: Volume @InlineOnly inline get() = ofUnit(Pints)
inline val Long.quarts: Volume @InlineOnly inline get() = ofUnit(Quarts)
inline val Long.gallons: Volume @InlineOnly inline get() = ofUnit(Gallons)

inline val Long.poundForce: Force @InlineOnly inline get() = ofUnit(PoundForce)

inline val Long.horsepower: Power @InlineOnly inline get() = ofUnit(Horsepower)


inline val Double.ounces: Mass @InlineOnly inline get() = ofUnit(Ounces)
inline val Double.pounds: Mass @InlineOnly inline get() = ofUnit(Pounds)
inline val Double.tons: Mass @InlineOnly inline get() = ofUnit(Tons)
inline val Double.longTons: Mass @InlineOnly inline get() = ofUnit(LongTons)

inline val Double.mils: Length @InlineOnly inline get() = ofUnit(Mils)
inline val Double.thous: Length @InlineOnly inline get() = ofUnit(Thous)
inline val Double.inches: Length @InlineOnly inline get() = ofUnit(Inches)
inline val Double.feet: Length @InlineOnly inline get() = ofUnit(Feet)
inline val Double.surveyFeet: Length @InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Double.yards: Length @InlineOnly inline get() = ofUnit(Yards)
inline val Double.miles: Length @InlineOnly inline get() = ofUnit(Miles)

inline val Double.acres: Area @InlineOnly inline get() = ofUnit(Acres)

inline val Double.teaspoons: Volume @InlineOnly inline get() = ofUnit(Teaspoons)
inline val Double.tablespoons: Volume @InlineOnly inline get() = ofUnit(Tablespoons)
inline val Double.fluidOunces: Volume @InlineOnly inline get() = ofUnit(FluidOunces)
inline val Double.cups: Volume @InlineOnly inline get() = ofUnit(Cups)
inline val Double.pints: Volume @InlineOnly inline get() = ofUnit(Pints)
inline val Double.quarts: Volume @InlineOnly inline get() = ofUnit(Quarts)
inline val Double.gallons: Volume @InlineOnly inline get() = ofUnit(Gallons)

inline val Double.poundForce: Force @InlineOnly inline get() = ofUnit(PoundForce)

inline val Double.horsepower: Power @InlineOnly inline get() = ofUnit(Horsepower)