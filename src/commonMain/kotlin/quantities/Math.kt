@file:Suppress("unused")
package com.batterystaple.kmeasure.quantities

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.interop.QuantityNumber
import com.batterystaple.kmeasure.interop.transformWithSIValue
import com.batterystaple.kmeasure.units.radians
import kotlin.math.*

fun <D : AnyDimension> abs(x: Quantity<D>): Quantity<D> = x.transformWithSIValue(::abs)
fun <D : AnyDimension> max(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(max(a.siValue, b.siValue))
fun <D : AnyDimension> min(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(min(a.siValue, b.siValue))

fun <D : AnyDimension> sign(x: Quantity<D>): Quantity<D> = x.transformWithSIValue(::sign)
fun <D : AnyDimension> Quantity<D>.withSign(sign: Int): Quantity<D> = Quantity(siValue.withSign(sign))
fun <D : AnyDimension> Quantity<D>.withSign(sign: Double): Quantity<D> = Quantity(siValue.withSign(sign))
fun <D : AnyDimension> Quantity<D>.withSign(sign: Quantity<*>): Quantity<D> = Quantity(siValue.withSign(sign.siValue))

fun sin(x: Angle): Double = sin(x.inUnit(radians))
fun cos(x: Angle): Double = cos(x.inUnit(radians))
fun tan(x: Angle): Double = tan(x.inUnit(radians))

fun asin(x: Double): Angle = kotlin.math.asin(x).ofUnit(radians)
fun acos(x: Double): Angle = kotlin.math.acos(x).ofUnit(radians)
fun atan(x: Double): Angle = kotlin.math.atan(x).ofUnit(radians)
fun atan2(y: Double, x: Double): Angle = kotlin.math.atan2(y = y, x = x).ofUnit(radians)
fun atan2(y: Length, x: Length): Angle = kotlin.math.atan2(y = y.siValue, x = x.siValue).ofUnit(radians)

fun <D : AnyDimension> hypot(x: Quantity<D>, y: Quantity<D>): Quantity<D> = Quantity(hypot(x.siValue, y.siValue))

fun <D : AnyDimension> Quantity<D>.nextUp(): Quantity<D> = transformWithSIValue(QuantityNumber::nextUp)
fun <D : AnyDimension> Quantity<D>.nextDown(): Quantity<D> = transformWithSIValue(QuantityNumber::nextDown)
fun <D : AnyDimension> Quantity<D>.nextTowards(to: Quantity<D>): Quantity<D> = Quantity(siValue.nextTowards(to.siValue))

inline val <D : AnyDimension> Quantity<D>.absoluteValue: Quantity<D> get() = abs(this)
inline val <D : AnyDimension> Quantity<D>.sign: Quantity<D> get() = sign(this)
inline val <D : AnyDimension> Quantity<D>.ulp: Quantity<D> get() = transformWithSIValue(Double::ulp)
