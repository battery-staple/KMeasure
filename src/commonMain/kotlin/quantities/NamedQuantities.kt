@file:Suppress("unused")
package com.batterystaple.kmeasure.quantities

import com.batterystaple.kmeasure.dimensions.*

typealias Scalar = Quantity<ScalarDimension>
typealias Time = Quantity<TimeDimension>
typealias Frequency = Quantity<FrequencyDimension>
typealias Length = Quantity<LengthDimension>
typealias Area = Quantity<AreaDimension>
typealias Volume = Quantity<VolumeDimension>
typealias Density = Quantity<DensityDimension>
typealias Velocity = Quantity<VelocityDimension>
typealias Acceleration = Quantity<AccelerationDimension>
typealias Mass = Quantity<MassDimension>
typealias Momentum = Quantity<MomentumDimension>
typealias Force = Quantity<ForceDimension>
typealias Pressure = Quantity<PressureDimension>
typealias Energy = Quantity<EnergyDimension>
typealias Power = Quantity<PowerDimension>

typealias SquareTime = Quantity<SquareTimeDimension>
typealias Absment = Quantity<AbsmentDimension>
typealias AreaTime = Quantity<AreaTimeDimension>
typealias MassTime = Quantity<MassTimeDimension>
typealias MassLength = Quantity<MassLengthDimension>
typealias Viscosity = Quantity<ViscosityDimension>
typealias Action = Quantity<ActionDimension>
typealias InverseTimeSquared = Quantity<InverseTimeSquaredDimension>
typealias AreaPerTime = Quantity<AreaPerTimeDimension>
typealias MassFlowRate = Quantity<MassFlowRateDimension>
typealias SpecificEnergy = Quantity<SpecificEnergyDimension>
typealias MassPerSquareTime = Quantity<MassPerSquareTimeDimension>
typealias MassArea = Quantity<MassAreaDimension>

typealias InverseLength = Quantity<InverseLengthDimension>
typealias InverseArea = Quantity<InverseAreaDimension>
typealias InverseVelocity = Quantity<InverseVelocityDimension>
typealias InverseAcceleration = Quantity<InverseAccelerationDimension>
typealias InverseMass = Quantity<InverseMassDimension>
typealias InverseMomentum = Quantity<InverseMomentumDimension>
typealias InverseForce = Quantity<InverseForceDimension>
typealias InversePressure = Quantity<InversePressureDimension>
typealias InverseEnergy = Quantity<InverseEnergyDimension>
typealias TimeSquared = Quantity<TimeSquaredDimension>
typealias TimePerArea = Quantity<TimePerAreaDimension>
typealias InverseMassFlowRate = Quantity<InverseMassFlowRateDimension>

typealias Distance = Length
typealias Impulse = Momentum
typealias Angle = Scalar
typealias AngularVelocity = Frequency
typealias AngularAcceleration = InverseTimeSquared
typealias AngularMomentum = Action
typealias Stress = Pressure