package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.Dimension
import com.batterystaple.kmeasure.quantities.Quantity
import com.batterystaple.kmeasure.quantities.QuantityNumber

inline fun <D : Dimension<*, *, *, *>> Quantity<D>.transformWithSIValue(
    transform: (QuantityNumber) -> QuantityNumber
): Quantity<D> = Quantity(transform(siValue))