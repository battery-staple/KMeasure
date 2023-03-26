@file:Suppress("unused")
package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.quantities.Quantity
import com.batterystaple.kmeasure.quantities.QuantityNumber


// region: Sequence Extensions
inline fun <D : AnyDimension> Sequence<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> =
    map(Quantity<*>::siValue)
        .aggregate()
        .let(::Quantity)

fun <D : AnyDimension> Sequence<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Sequence<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.internal.InlineOnly
inline fun <T, D : AnyDimension> Sequence<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> {
    var sum: Quantity<D> = Quantity(0.0)
    for (element in this) {
        sum += selector(element)
    }
    return sum
}
//endregion

// region: Iterable Extensions
inline fun <D : AnyDimension> Iterable<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : AnyDimension> Iterable<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Iterable<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.internal.InlineOnly
fun <T, D : AnyDimension> Iterable<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> =
    asSequence().sumOf(selector)
// endregion

// region: Array Extensions
inline fun <D : AnyDimension> Array<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : AnyDimension> Array<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : AnyDimension> Array<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.internal.InlineOnly
fun <T, D : AnyDimension> Array<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> =
    asSequence().sumOf(selector)
// endregion