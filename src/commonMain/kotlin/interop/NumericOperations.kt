package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.quantities.Quantity

fun <D : AnyDimension> Quantity<D>.transformWithSIValue(
    transform: (QuantityNumber) -> QuantityNumber
): Quantity<D> = Quantity(transform(siValue))