@file:Suppress("unused")
package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.Dimension
import com.batterystaple.kmeasure.quantities.Quantity

typealias QuantityNumber = Double
fun <D : Dimension<*, *, *>> Sequence<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> =
    map(Quantity<*>::siValue)
        .aggregate()
        .let(::Quantity)

fun <D : Dimension<*, *, *>> Sequence<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*, *, *>> Sequence<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : Dimension<*, *, *>> Iterable<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : Dimension<*, *, *>> Iterable<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*, *, *>> Iterable<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : Dimension<*, *, *>> Array<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : Dimension<*, *, *>> Array<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*, *, *>> Array<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)