@file:Suppress("unused")
package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.Dimension
import com.batterystaple.kmeasure.quantities.Quantity
import com.batterystaple.kmeasure.quantities.QuantityNumber

// region: Sequence Extensions
inline fun <D : Dimension<*, *, *, *>> Sequence<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> =
    map(Quantity<*>::siValue)
        .aggregate()
        .let(::Quantity)

fun <D : Dimension<*, *, *, *>> Sequence<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*, *, *, *>> Sequence<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfQuantity")
@kotlin.internal.InlineOnly
inline fun <T, D : Dimension<*, *, *, *>> Sequence<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> {
    var sum: Quantity<D> = Quantity(0.0)
    for (element in this) {
        sum += selector(element)
    }
    return sum
}
//endregion

// region: Iterable Extensions
inline fun <D : Dimension<*,*,*,*>> Iterable<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : Dimension<*,*,*,*>> Iterable<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*,*,*,*>> Iterable<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfQuantity")
@kotlin.internal.InlineOnly
fun <T, D : Dimension<*,*,*,*>> Iterable<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> =
    asSequence().sumOf(selector)
// endregion

// region: Array Extensions
inline fun <D : Dimension<*,*,*,*>> Array<Quantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): Quantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : Dimension<*,*,*,*>> Array<Quantity<D>>.average(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : Dimension<*,*,*,*>> Array<Quantity<D>>.sum(): Quantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfQuantity")
@kotlin.internal.InlineOnly
fun <T, D : Dimension<*,*,*,*>> Array<T>.sumOf(selector: (T) -> Quantity<D>): Quantity<D> =
    asSequence().sumOf(selector)
// endregion