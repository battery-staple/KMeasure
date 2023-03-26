@file:Suppress("unused")
package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.quantities.Quantity

typealias QuantityNumber = Double
fun <D : AnyDimension> Sequence<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> =
    map(Quantity<*>::siValue)
        .aggregate()
        .let(::Quantity)

fun <D : AnyDimension> Sequence<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Sequence<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : AnyDimension> Iterable<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : AnyDimension> Iterable<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Iterable<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : AnyDimension> Array<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : AnyDimension> Array<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Array<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)