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


inline val Int.ounces: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Int.pounds: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Int.tons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Int.longTons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Int.mils: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Int.thous: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Int.inches: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Int.feet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Int.surveyFeet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Int.yards: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Int.miles: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Int.acres: DimensionedQuantity<AreaDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Int.teaspoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Int.tablespoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Int.fluidOunces: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Int.cups: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Int.pints: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Int.quarts: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Int.gallons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Int.poundForce: DimensionedQuantity<ForceDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Int.horsepower: DimensionedQuantity<PowerDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)


inline val Long.ounces: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Long.pounds: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Long.tons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Long.longTons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Long.mils: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Long.thous: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Long.inches: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Long.feet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Long.surveyFeet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Long.yards: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Long.miles: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Long.acres: DimensionedQuantity<AreaDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Long.teaspoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Long.tablespoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Long.fluidOunces: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Long.cups: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Long.pints: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Long.quarts: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Long.gallons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Long.poundForce: DimensionedQuantity<ForceDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Long.horsepower: DimensionedQuantity<PowerDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)


inline val Double.ounces: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Ounces)
inline val Double.pounds: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pounds)
inline val Double.tons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tons)
inline val Double.longTons: DimensionedQuantity<MassDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(LongTons)

inline val Double.mils: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Mils)
inline val Double.thous: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Thous)
inline val Double.inches: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Inches)
inline val Double.feet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Feet)
inline val Double.surveyFeet: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(SurveyFeet)
inline val Double.yards: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Yards)
inline val Double.miles: DimensionedQuantity<LengthDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Miles)

inline val Double.acres: DimensionedQuantity<AreaDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Acres)

inline val Double.teaspoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Teaspoons)
inline val Double.tablespoons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Tablespoons)
inline val Double.fluidOunces: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(FluidOunces)
inline val Double.cups: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Cups)
inline val Double.pints: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Pints)
inline val Double.quarts: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Quarts)
inline val Double.gallons: DimensionedQuantity<VolumeDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Gallons)

inline val Double.poundForce: DimensionedQuantity<ForceDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(PoundForce)

inline val Double.horsepower: DimensionedQuantity<PowerDimension> @kotlin.internal.InlineOnly inline get() = ofUnit(Horsepower)