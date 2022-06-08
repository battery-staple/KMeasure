package com.batterystaple.kmeasure

fun <D : CompositeDimension<*, *, *>> Sequence<DimensionedQuantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): DimensionedQuantity<D> =
    map(DimensionedQuantity<*>::siValue)
        .aggregate()
        .let(::DimensionedQuantity)

fun <D : CompositeDimension<*, *, *>> Sequence<DimensionedQuantity<D>>.average(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : CompositeDimension<*, *, *>> Sequence<DimensionedQuantity<D>>.sum(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : CompositeDimension<*, *, *>> Iterable<DimensionedQuantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): DimensionedQuantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : CompositeDimension<*, *, *>> Iterable<DimensionedQuantity<D>>.average(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : CompositeDimension<*, *, *>> Iterable<DimensionedQuantity<D>>.sum(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)

fun <D : CompositeDimension<*, *, *>> Array<DimensionedQuantity<D>>.aggregateWithSIValue(
    aggregate: Sequence<QuantityNumber>.() -> QuantityNumber
): DimensionedQuantity<D> = asSequence().aggregateWithSIValue(aggregate)

fun <D : CompositeDimension<*, *, *>> Array<DimensionedQuantity<D>>.average(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::average)

fun <D : CompositeDimension<*, *, *>> Array<DimensionedQuantity<D>>.sum(): DimensionedQuantity<D> =
    aggregateWithSIValue(Sequence<QuantityNumber>::sum)