@file:Suppress("unused")
package com.batterystaple.kmeasure.quantities

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.interop.transformWithSIValue
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun <D : AnyDimension> abs(x: Quantity<D>): Quantity<D> = x.transformWithSIValue(::abs)
fun <D : AnyDimension> max(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(max(a.siValue, b.siValue))
fun <D : AnyDimension> min(a: Quantity<D>, b: Quantity<D>): Quantity<D> = Quantity(min(a.siValue, b.siValue))

val <D : AnyDimension> Quantity<D>.absoluteValue: Quantity<D> get() = abs(this)