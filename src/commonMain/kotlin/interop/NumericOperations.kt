package com.batterystaple.kmeasure.interop

import com.batterystaple.kmeasure.dimensions.AnyDimension
import com.batterystaple.kmeasure.quantities.Quantity
import com.batterystaple.kmeasure.quantities.QuantityNumber

inline fun <D : AnyDimension> Quantity<D>.transformWithSIValue(
    transform: (QuantityNumber) -> QuantityNumber
): Quantity<D> = Quantity(transform(siValue))