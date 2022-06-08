package com.batterystaple.kmeasure

import kotlin.jvm.JvmInline

typealias QuantityNumber = Double

@JvmInline
value class DimensionedQuantity<D : CompositeDimension<*, *, *>>(val siValue: QuantityNumber) : Comparable<DimensionedQuantity<D>> {
    inline operator fun plus(other: DimensionedQuantity<D>): DimensionedQuantity<D> =
        DimensionedQuantity(siValue + other.siValue)
    inline operator fun minus(other: DimensionedQuantity<D>): DimensionedQuantity<D> =
        DimensionedQuantity(siValue - other.siValue)
    inline operator fun unaryMinus(): DimensionedQuantity<D> =
        DimensionedQuantity(-siValue)

    inline operator fun unaryPlus(): DimensionedQuantity<D> =
        DimensionedQuantity(+siValue)

    override fun compareTo(other: DimensionedQuantity<D>): Int = siValue.compareTo(other.siValue)

    override fun toString(): String =
        "DimensionedQuantity(siValue=$siValue) (Units erased)"
}