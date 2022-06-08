package com.batterystaple.kmeasure

fun <D : CompositeDimension<*, *, *>> DimensionedQuantity<D>.transformWithSIValue(
    transform: (QuantityNumber) -> QuantityNumber
): DimensionedQuantity<D> = DimensionedQuantity(transform(siValue))