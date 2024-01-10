@file:Suppress("unused")
package com.batterystaple.kmeasure.quantities

import com.batterystaple.kmeasure.dimensions.Dimension
import kotlin.internal.InlineOnly

inline val Scalar.value get() = siValue

@InlineOnly inline fun <D : Dimension<*,*,*,*>> Int.ofUnit(unit: Quantity<D>): Quantity<D> =
    Quantity(siValue = unit.siValue * this.toDouble())
@InlineOnly inline fun <D : Dimension<*,*,*,*>> Long.ofUnit(unit: Quantity<D>): Quantity<D> =
    Quantity(siValue = unit.siValue * this.toDouble())
@InlineOnly inline fun <D : Dimension<*,*,*,*>> Double.ofUnit(unit: Quantity<D>): Quantity<D> =
    Quantity(siValue = unit.siValue * this)

@InlineOnly inline fun <D : Dimension<*,*,*,*>> Quantity<D>.inUnit(unit: Quantity<D>): QuantityNumber =
    this.siValue / unit.siValue

@InlineOnly inline operator fun Scalar.plus(other: QuantityNumber): Scalar = Scalar(this.siValue + other)
@InlineOnly inline operator fun QuantityNumber.plus(other: Scalar): Scalar = Scalar(this + other.siValue)
@InlineOnly inline operator fun Scalar.minus(other: QuantityNumber): Scalar = Scalar(this.siValue - other)
@InlineOnly inline operator fun QuantityNumber.minus(other: Scalar): Scalar = Scalar(this - other.siValue)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        QuantityNumber.times(other: Quantity<D>): Quantity<D> =
    Quantity(this * other.siValue)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        Quantity<D>.times(other: QuantityNumber): Quantity<D> =
    Quantity(this.siValue * other)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        Quantity<D>.div(other: QuantityNumber): Quantity<D> =
    Quantity(this.siValue / other)

@InlineOnly inline operator fun Scalar.plus(other: Int): Scalar = Scalar(this.siValue + other)
@InlineOnly inline operator fun Int.plus(other: Scalar): Scalar = Scalar(this + other.siValue)
@InlineOnly inline operator fun Scalar.minus(other: Int): Scalar = Scalar(this.siValue - other)
@InlineOnly inline operator fun Int.minus(other: Scalar): Scalar = Scalar(this - other.siValue)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        Int.times(other: Quantity<D>): Quantity<D> =
    Quantity(this * other.siValue)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        Quantity<D>.times(other: Int): Quantity<D> =
    Quantity(this.siValue * other)
@InlineOnly inline operator fun <D : Dimension<*,*,*,*>>
        Quantity<D>.div(other: Int): Quantity<D> =
    Quantity(this.siValue / other)