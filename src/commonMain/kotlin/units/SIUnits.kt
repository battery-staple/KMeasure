@file:Suppress("unused")
package com.batterystaple.kmeasure.units

import com.batterystaple.kmeasure.quantities.*
import kotlin.internal.InlineOnly

val radians: Angle by lazy { Angle(1.0) }

val grams: Mass by lazy { Mass(0.001) }

val meters: Length by lazy { Length(1.0) }

val seconds: Time by lazy { Time(1.0) }

val hertz: Frequency by lazy { Frequency(1.0) }

val newtons: Force by lazy { Force(1.0) }

val pascals: Pressure by lazy { Pressure(1.0) }

val joules: Energy by lazy { Energy(1.0) }

val watts: Power by lazy { Power(1.0) }

inline val Int.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)
inline val Int.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)
inline val Int.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Int.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Int.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Int.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Int.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Int.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)


inline val Long.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)
inline val Long.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)
inline val Long.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Long.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Long.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Long.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Long.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Long.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)


inline val Double.seconds: Time @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.seconds)
inline val Double.meters: Length @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.meters)
inline val Double.grams: Mass @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.grams)

inline val Double.hertz: Frequency @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.hertz)

inline val Double.newtons: Force @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.newtons)

inline val Double.pascals: Pressure @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.pascals)

inline val Double.joules: Energy @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.joules)

inline val Double.watts: Power @InlineOnly inline get() = ofUnit(com.batterystaple.kmeasure.units.watts)