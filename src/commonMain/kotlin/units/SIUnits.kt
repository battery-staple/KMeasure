@file:Suppress("unused")
package com.batterystaple.kmeasure.units

import com.batterystaple.kmeasure.quantities.*
import kotlin.internal.InlineOnly

val radians: Angle = Angle(1.0)

val grams: Mass = Mass(0.001) // The SI unit for mass is actually the kilogram, but we want prefixes
                                               //  to work properly (e.g. 1.milli.kilograms would be undesirable)

val meters: Length = Length(1.0)

val seconds: Time = Time(1.0)

val amperes: Current = Current(1.0)
inline val amps: Current @InlineOnly get() = amperes

val hertz: Frequency = Frequency(1.0)

val newtons: Force = Force(1.0)

val pascals: Pressure = Pressure(1.0)

val joules: Energy = Energy(1.0)

val watts: Power = Power(1.0)

val coulombs: Charge = Charge(1.0)

val volts: ElectricalPotential = ElectricalPotential(1.0)

val farads: Capacitance = Capacitance(1.0)

val ohms: Resistance = Resistance(1.0)

val siemens: Conductance = Conductance(1.0)
inline val mhos: Conductance @InlineOnly get() = siemens

val webers: MagneticFlux = MagneticFlux(1.0)

val teslas: MagneticFluxDensity = MagneticFluxDensity(1.0)

val henries: Inductance = Inductance(1.0)


inline val Int.radians: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.radians)

inline val Int.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Int.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)

inline val Int.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)

inline val Int.amperes: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amperes)
inline val Int.amps: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amps)

inline val Int.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Int.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Int.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Int.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Int.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)

inline val Int.coulombs: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.coulombs)

inline val Int.volts: ElectricalPotential @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.volts)

inline val Int.farads: Capacitance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.farads)

inline val Int.ohms: Resistance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ohms)

inline val Int.siemens: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.siemens)
inline val Int.mhos: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mhos)

inline val Int.webers: MagneticFlux @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.webers)

inline val Int.teslas: MagneticFluxDensity @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teslas)

inline val Int.henries: Inductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.henries)


inline val Long.radians: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.radians)

inline val Long.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Long.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)

inline val Long.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)

inline val Long.amperes: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amperes)
inline val Long.amps: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amps)

inline val Long.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Long.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Long.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Long.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Long.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)

inline val Long.coulombs: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.coulombs)

inline val Long.volts: ElectricalPotential @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.volts)

inline val Long.farads: Capacitance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.farads)

inline val Long.ohms: Resistance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ohms)

inline val Long.siemens: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.siemens)
inline val Long.mhos: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mhos)

inline val Long.webers: MagneticFlux @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.webers)

inline val Long.teslas: MagneticFluxDensity @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teslas)

inline val Long.henries: Inductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.henries)


inline val Double.radians: Angle @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.radians)

inline val Double.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Double.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)

inline val Double.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)

inline val Double.amperes: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amperes)
inline val Double.amps: Current @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.amps)

inline val Double.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Double.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Double.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Double.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Double.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)

inline val Double.coulombs: Charge @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.coulombs)

inline val Double.volts: ElectricalPotential @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.volts)

inline val Double.farads: Capacitance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.farads)

inline val Double.ohms: Resistance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.ohms)

inline val Double.siemens: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.siemens)
inline val Double.mhos: Conductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.mhos)

inline val Double.webers: MagneticFlux @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.webers)

inline val Double.teslas: MagneticFluxDensity @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.teslas)

inline val Double.henries: Inductance @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.henries)