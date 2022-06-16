@file:Suppress("unused")
package com.batterystaple.kmeasure.dimensions

sealed interface BaseLengthDimension
sealed interface LengthN6 : BaseLengthDimension
sealed interface LengthN5 : BaseLengthDimension
sealed interface LengthN4 : BaseLengthDimension
sealed interface LengthN3 : BaseLengthDimension
sealed interface LengthN2 : BaseLengthDimension
sealed interface LengthN1 : BaseLengthDimension
sealed interface Length0 : BaseLengthDimension
sealed interface Length1 : BaseLengthDimension
sealed interface Length2 : BaseLengthDimension
sealed interface Length3 : BaseLengthDimension
sealed interface Length4 : BaseLengthDimension
sealed interface Length5 : BaseLengthDimension
sealed interface Length6 : BaseLengthDimension

sealed interface BaseTimeDimension
sealed interface TimeN6 : BaseTimeDimension
sealed interface TimeN5 : BaseTimeDimension
sealed interface TimeN4 : BaseTimeDimension
sealed interface TimeN3 : BaseTimeDimension
sealed interface TimeN2 : BaseTimeDimension
sealed interface TimeN1 : BaseTimeDimension
sealed interface Time0 : BaseTimeDimension
sealed interface Time1 : BaseTimeDimension
sealed interface Time2 : BaseTimeDimension
sealed interface Time3 : BaseTimeDimension
sealed interface Time4 : BaseTimeDimension
sealed interface Time5 : BaseTimeDimension
sealed interface Time6 : BaseTimeDimension

sealed interface BaseMassDimension
sealed interface MassN2 : BaseMassDimension
sealed interface MassN1 : BaseMassDimension
sealed interface Mass0 : BaseMassDimension
sealed interface Mass1 : BaseMassDimension
sealed interface Mass2 : BaseMassDimension