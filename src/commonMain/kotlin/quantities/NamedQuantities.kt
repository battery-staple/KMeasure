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
typealias MassFlowRate = Quantity<MassFlowRateDimension>
typealias SpecificEnergy = Quantity<SpecificEnergyDimension>
typealias MassPerSquareTime = Quantity<MassPerSquareTimeDimension>
typealias MomentOfInertia = Quantity<MomentOfInertiaDimension>
typealias SurfaceDensity = Quantity<SurfaceDensityDimension>
typealias Irradiance = Quantity<IrradianceDimension>

typealias Current = Quantity<CurrentDimension>
typealias Charge = Quantity<ChargeDimension>
typealias ElectricalPotential = Quantity<ElectricalPotentialDimension>
typealias Capacitance = Quantity<CapacitanceDimension>
typealias Resistance = Quantity<ResistanceDimension>
typealias Conductance = Quantity<ConductanceDimension>
typealias MagneticFlux = Quantity<MagneticFluxDimension>
typealias MagneticFluxDensity = Quantity<MagneticFluxDensityDimension>
typealias Inductance = Quantity<InductanceDimension>
typealias CurrentDensity = Quantity<CurrentDensityDimension>
typealias MagneticFieldStrength = Quantity<MagneticFieldStrengthDimension>
typealias ElectricFieldStrength = Quantity<ElectricFieldStrengthDimension>
typealias ChargeDensity = Quantity<ChargeDensityDimension>
typealias SurfaceChargeDensity = Quantity<SurfaceChargeDensityDimension>
typealias Permittivity = Quantity<PermittivityDimension>
typealias Permeability = Quantity<PermeabilityDimension>

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
typealias Speed = Velocity
typealias Impulse = Momentum
typealias Angle = Scalar
typealias AngularVelocity = Frequency
typealias AngularFrequency = Frequency
typealias AngularAcceleration = InverseTimeSquared
typealias AngularMomentum = Action
typealias Work = Energy
typealias Heat = Energy
typealias RadiantFlux = Power
typealias Stress = Pressure
typealias EnergyDensity = Pressure
typealias MomentOfForce = Energy
typealias Torque = MomentOfForce
typealias SurfaceTension = MassPerSquareTime
typealias MassConcentration = Density
typealias Wavenumber = InverseLength
typealias Vergence = InverseLength
typealias AreaPerTime = SpecificEnergy
typealias Voltage = ElectricalPotential
typealias ElectromotiveForce = ElectricalPotential
typealias Impedance = Resistance
typealias Reactance = Resistance
typealias HeatFluxDensity = Irradiance
typealias ElectricFluxDensity = SurfaceChargeDensity
typealias ElectricDisplacement = SurfaceChargeDensity