@file:Suppress("unused")

package com.batterystaple.kmeasure

val Radians by lazy { Angle(1.0) }

val Grams by lazy { Mass(0.001) }

val Meters by lazy { Length(1.0) }

val Seconds by lazy { Time(1.0) }

val Hertz by lazy { Frequency(1.0) }

val Newtons by lazy { Force(1.0) }

val Pascals by lazy { Pressure(1.0) }

val Joules by lazy { Energy(1.0) }

val Watts by lazy { Power(1.0) }

inline val Int.seconds: Time @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Int.meters: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Int.grams: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Int.hertz: Frequency @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)


inline val Long.seconds: Time @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Long.meters: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Long.grams: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Long.hertz: Frequency @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)


inline val Double.seconds: Time @kotlin.internal.InlineOnly inline get() = ofUnit(Seconds)
inline val Double.meters: Length @kotlin.internal.InlineOnly inline get() = ofUnit(Meters)
inline val Double.grams: Mass @kotlin.internal.InlineOnly inline get() = ofUnit(Grams)

inline val Double.hertz: Frequency @kotlin.internal.InlineOnly inline get() = ofUnit(Hertz)
