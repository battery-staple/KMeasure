package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.Dimension
import com.batterystaple.kmeasure.quantities.Quantity

fun <D : Dimension<*, *, *>> Quantity<D>.transformWithSIValue(
    transform: (QuantityNumber) -> QuantityNumber
): Quantity<D> = Quantity(transform(siValue))