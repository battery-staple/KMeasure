@file:Suppress("unused")
package com.batterystaple.kmeasure.dimensions

class Dimension<M : BaseMassDimension, L : BaseLengthDimension, T : BaseTimeDimension, I : BaseCurrentDimension> private constructor()
typealias AnyDimension = Dimension<*, *, *, *>
