@file:Suppress("unused")
package com.batterystaple.kmeasure.dimensions

class Dimension<M : BaseMassDimension, L : BaseLengthDimension, T : BaseTimeDimension> private constructor()
typealias AnyDimension = Dimension<*, *, *>
