package com.batterystaple.kmeasure

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun <D : Dimension> abs(x: DimensionedQuantity<D>): DimensionedQuantity<D> = x.transformWithSIValue(::abs)
fun <D : Dimension> max(a: DimensionedQuantity<D>, b: DimensionedQuantity<D>): DimensionedQuantity<D> = DimensionedQuantity(max(a.siValue, b.siValue))
fun <D : Dimension> min(a: DimensionedQuantity<D>, b: DimensionedQuantity<D>): DimensionedQuantity<D> = DimensionedQuantity(min(a.siValue, b.siValue))

val <D : Dimension> DimensionedQuantity<D>.absoluteValue: DimensionedQuantity<D> get() = abs(this)