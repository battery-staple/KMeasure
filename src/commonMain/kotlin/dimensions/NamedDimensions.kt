@file:Suppress("unused")
package com.batterystaple.kmeasure.dimensions

typealias ScalarDimension = Dimension<Mass0, Length0, Time0>
typealias TimeDimension = Dimension<Mass0, Length0, Time1>
typealias FrequencyDimension = Dimension<Mass0, Length0, TimeN1>
typealias LengthDimension = Dimension<Mass0, Length1, Time0>
typealias AreaDimension = Dimension<Mass0, Length2, Time0>
typealias VolumeDimension = Dimension<Mass0, Length3, Time0>
typealias DensityDimension = Dimension<Mass1, Length3, Time0>
typealias VelocityDimension = Dimension<Mass0, Length1, TimeN1>
typealias AccelerationDimension = Dimension<Mass0, Length1, TimeN2>
typealias MassDimension = Dimension<Mass1, Length0, Time0>
typealias MomentumDimension = Dimension<Mass1, Length1, TimeN1>
typealias ForceDimension = Dimension<Mass1, Length1, TimeN2>
typealias PressureDimension = Dimension<Mass1, LengthN1, TimeN2>
typealias EnergyDimension = Dimension<Mass1, Length2, TimeN2>
typealias PowerDimension = Dimension<Mass1, Length2, TimeN3>

typealias SquareTimeDimension = Dimension<Mass0, Length0, Time2>
typealias AbsmentDimension = Dimension<Mass0, Length1, Time1>
typealias AreaTimeDimension = Dimension<Mass0, Length2, Time1>
typealias MassTimeDimension = Dimension<Mass1, Length0, Time1>
typealias MassLengthDimension = Dimension<Mass1, Length1, Time0>
typealias ViscosityDimension = Dimension<Mass1, LengthN1, TimeN1>
typealias ActionDimension = Dimension<Mass1, Length2, TimeN1>
typealias InverseTimeSquaredDimension = Dimension<Mass0, Length0, TimeN2>
typealias AreaPerTimeDimension = Dimension<Mass0, Length2, TimeN2>
typealias MassFlowRateDimension = Dimension<Mass1, Length0, TimeN1>
typealias SpecificEnergyDimension = Dimension<Mass0, LengthN2, TimeN2>
typealias MassPerSquareTimeDimension = Dimension<Mass1, Length0, TimeN2>
typealias MassAreaDimension = Dimension<Mass1, Length2, Time0>

typealias InverseLengthDimension = Dimension<Mass0, LengthN1, Time0>
typealias InverseAreaDimension = Dimension<Mass0, LengthN2, Time0>
typealias InverseVelocityDimension = Dimension<Mass0, LengthN1, Time1>
typealias InverseAccelerationDimension = Dimension<Mass0, LengthN1, Time2>
typealias InverseMassDimension = Dimension<MassN1, Length0, Time0>
typealias InverseMomentumDimension = Dimension<MassN1, LengthN1, Time1>
typealias InverseForceDimension = Dimension<MassN1, LengthN1, Time2>
typealias InversePressureDimension = Dimension<MassN1, Length1, Time2>
typealias InverseEnergyDimension = Dimension<MassN1, LengthN2, Time2>
typealias TimeSquaredDimension = Dimension<Mass0, Length0, Time2>
typealias TimePerAreaDimension = Dimension<Mass0, LengthN2, Time1>
typealias InverseMassFlowRateDimension = Dimension<MassN1, Length0, Time1>

typealias DistanceDimension = LengthDimension
typealias ImpulseDimension = MomentumDimension
typealias AngleDimension = ScalarDimension
typealias AngularVelocityDimension = FrequencyDimension
typealias AngularAccelerationDimension = InverseTimeSquaredDimension
typealias AngularMomentumDimension = ActionDimension