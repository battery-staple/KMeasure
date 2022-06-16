@file:Suppress("unused")
package com.batterystaple.kmeasure

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


inline val Int.ounces: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Int.pounds: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Int.tons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Int.longTons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Int.mils: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Int.thous: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Int.inches: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Int.feet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Int.surveyFeet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Int.yards: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Int.miles: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Int.acres: Area @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Int.teaspoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Int.tablespoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Int.fluidOunces: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Int.cups: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Int.pints: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Int.quarts: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Int.gallons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Int.poundForce: Force @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Int.horsepower: Power @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)


inline val Long.ounces: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Long.pounds: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Long.tons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Long.longTons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Long.mils: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Long.thous: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Long.inches: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Long.feet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Long.surveyFeet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Long.yards: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Long.miles: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Long.acres: Area @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Long.teaspoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Long.tablespoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Long.fluidOunces: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Long.cups: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Long.pints: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Long.quarts: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Long.gallons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Long.poundForce: Force @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Long.horsepower: Power @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)


inline val Double.ounces: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Double.pounds: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Double.tons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Double.longTons: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Double.mils: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Double.thous: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Double.inches: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Double.feet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Double.surveyFeet: Length @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Double.yards: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Double.miles: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Double.acres: Area @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Double.teaspoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Double.tablespoons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Double.fluidOunces: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Double.cups: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Double.pints: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Double.quarts: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Double.gallons: Volume @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Double.poundForce: Force @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Double.horsepower: Power @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)