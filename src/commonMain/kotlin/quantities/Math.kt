@file:Suppress("unused")
package com.batterystaple.kmeasure.quantities

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.interop.transformWithSIValue
import com.batterystaple.kmeasure.units.radians
import kotlin.math.*

// region extrema
/**
 * A version of [kotlin.math.max] that preserves units.
 *
 * @see [kotlin.math.max]
 */
fun <D : AnyDimension> max(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(max(a.siValue, b.siValue))

/**
 * A version of [kotlin.math.min] that preserves units.
 *
 * @see [kotlin.math.min]
 */
fun <D : AnyDimension> min(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(min(a.siValue, b.siValue))
// endregion

// region sign
/**
 * A version of [kotlin.math.abs] that preserves units.
 *
 * @see [kotlin.math.abs]
 */
fun <D : AnyDimension> abs(x: Quantity<D>): Quantity<D> = x.transformWithSIValue(::abs)

/**
 * A version of [kotlin.math.sign] for [Quantity]s.
 *
 * @see [kotlin.math.sign]
 */
fun <D : AnyDimension> sign(x: Quantity<D>): Double = sign(x.siValue)

/**
 * A version of [kotlin.math.withSign] for [Quantity]s.
 *
 * @see [kotlin.math.withSign]
 */
fun <D : AnyDimension> Quantity<D>.withSign(sign: Int): Quantity<D> = Quantity(siValue.withSign(sign))

/**
 * A version of [kotlin.math.withSign] for [Quantity]s.
 *
 * @see [kotlin.math.withSign]
 */
fun <D : AnyDimension> Quantity<D>.withSign(sign: Double): Quantity<D> = Quantity(siValue.withSign(sign))

/**
 * A version of [kotlin.math.withSign] for [Quantity]s.
 *
 * @see [kotlin.math.withSign]
 */
fun <D : AnyDimension> Quantity<D>.withSign(sign: Quantity<*>): Quantity<D> = Quantity(siValue.withSign(sign.siValue))
// endregion

// region trig
/**
 * A version of [kotlin.math.sin] for [Angle]s.
 *
 * @see [kotlin.math.sin]
 */
fun sin(x: Angle): Double = sin(x.inUnit(radians))

/**
 * A version of [kotlin.math.cos] for [Angle]s.
 *
 * @see [kotlin.math.cos]
 */
fun cos(x: Angle): Double = cos(x.inUnit(radians))

/**
 * A version of [kotlin.math.tan] for [Angle]s.
 *
 * @see [kotlin.math.tan]
 */
fun tan(x: Angle): Double = tan(x.inUnit(radians))

/**
 * A version of [kotlin.math.asin] returning an [Angle].
 *
 * @see [kotlin.math.asin]
 */
fun asin(x: Double): Angle = kotlin.math.asin(x).ofUnit(radians)

/**
 * A version of [kotlin.math.acos] returning an [Angle].
 *
 * @see [kotlin.math.acos]
 */
fun acos(x: Double): Angle = kotlin.math.acos(x).ofUnit(radians)

/**
 * A version of [kotlin.math.atan] returning an [Angle].
 *
 * @see [kotlin.math.atan]
 */
fun atan(x: Double): Angle = kotlin.math.atan(x).ofUnit(radians)

/**
 * A version of [kotlin.math.atan2] returning an [Angle].
 *
 * @see [kotlin.math.asin]
 */
fun atan2(y: Double, x: Double): Angle = kotlin.math.atan2(y = y, x = x).ofUnit(radians)

/**
 * A version of [kotlin.math.asin] for [Length]s, returning an [Angle].
 *
 * @see [kotlin.math.asin]
 */
fun atan2(y: Length, x: Length): Angle = kotlin.math.atan2(y = y.siValue, x = x.siValue).ofUnit(radians)

/**
 * A version of [kotlin.math.hypot] for [Quantity]s.
 *
 * @see [kotlin.math.hypot]
 */
fun <D : AnyDimension> hypot(x: Quantity<D>, y: Quantity<D>): Quantity<D> = Quantity(hypot(x.siValue, y.siValue))
// endregion

// region floating point
/**
 * A version of [kotlin.math.nextUp] for [Quantity]s.
 *
 * @see [kotlin.math.nextUp]
 */
fun <D : AnyDimension> Quantity<D>.nextUp(): Quantity<D> = transformWithSIValue(QuantityNumber::nextUp)

/**
 * A version of [kotlin.math.nextDown] for [Quantity]s.
 *
 * @see [kotlin.math.nextDown]
 */
fun <D : AnyDimension> Quantity<D>.nextDown(): Quantity<D> = transformWithSIValue(QuantityNumber::nextDown)

/**
 * A version of [kotlin.math.nextTowards] for [Quantity]s.
 *
 * @see [kotlin.math.nextTowards]
 */
fun <D : AnyDimension> Quantity<D>.nextTowards(to: Quantity<D>): Quantity<D> = Quantity(siValue.nextTowards(to.siValue))
// endregion

// region extension properties
/**
 * A version of [kotlin.math.absoluteValue] that preserves units.
 *
 * @see [kotlin.math.withSign]
 */
inline val <D : AnyDimension> Quantity<D>.absoluteValue: Quantity<D> get() = abs(this)

/**
 * A version of [kotlin.math.sign] for [Quantity]s.
 *
 * @see [kotlin.math.sign]
 */
inline val <D : AnyDimension> Quantity<D>.sign: Double get() = sign(this)

/**
 * A version of [kotlin.math.ulp] for [Quantity]s.
 *
 * @see [kotlin.math.ulp]
 */
inline val <D : AnyDimension> Quantity<D>.ulp: Quantity<D> get() = transformWithSIValue(Double::ulp)
// endregion