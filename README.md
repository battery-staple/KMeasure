# KMeasure
KMeasure is a purely Kotlin, multiplatform, (almost!) entirely compile-time units library with very minimal runtime overhead.

# Features
### Extension property declarations:
```kotlin
val distance = 6.kilo.meters
val time = 0.2.seconds
val volume = 1.gallons
```
### Type checking:
```kotlin
val time: Time = 1.seconds // OK
val distance: Distance = 1.seconds // Compile Error! (Type mismatch: inferred type is Time but Distance was expected)
```
### Unit conversion (automatic and explicit):
```kotlin
1.hours + 30.minutes == 90.minutes // true
val secondsInTwoMins = 2.minutes.inUnit(seconds) // 120.0
val degreesPerRadian = 1.radians.inUnit(degrees) // 57.29577951308232
```
### Typesafe multiplication and division:
```kotlin
val velocity: Velocity = 3.miles / 1.hours // (same as 3.ofUnit(miles/hours))
val work: Energy = 200.grams * velocity / 2.seconds * 10.feet
val volume: Volume = PI * (2.centi.meters * 2.centi.meters) * 1.deci.meters
```
### Collection support:
```kotlin
val times: List<Time> = listOf(6.minutes, 10.minutes, 7.minutes, 9.minutes)
val averageSpeed: Velocity =
    times
        .map { 1.miles / it }
        .average()
```

# Gradle Setup
Make sure `mavenCentral` is added as a repository somewhere in your `build.gradle`:
```kotlin
repositories {
    mavenCentral()
}
```
Then add KMeasure to your dependencies:
```kotlin
dependencies {
    implementation("io.github.battery-staple:KMeasure:1.2.0")
}
```

# How it works
### Quantities
All KMeasure values with a unit (like instances of `Distance` or `Time`) are represented
under the hood as a `Quantity`:
```kotlin
value class Quantity<D : Dimension<*, *, *>>(val siValue: QuantityNumber) : Comparable<Quantity<D>> { /* body omitted */ }
```
As a value class, Quantities are represented at runtime simply as `Double`s (with some exceptions: see [docs](https://kotlinlang.org/docs/inline-classes.html#representation)).
This means that the following two snippets are identical at runtime and have therefore identical performance:
```kotlin
val time = 1.0.seconds + 5.0.seconds
```
```kotlin
val timeSeconds = 1.0 + 5.0
```
`Quantity` also defines various operators, such as `plus`, `minus`, `compareTo`, etc. to allow seamless arithmetic.
This isn't enough to mark the distinctions between types, however; that's what the type parameter `D`,
of type `Dimension`, is for.

### Dimension Basics
A dimension is a type of unit, like distance, power, volume, pressure, et cetera.
All dimensions can be written as a product of six base dimensions:
mass, length, time, current, temperature, and luminous intensity.
Units can include these base dimensions multiple times: for example,
area is length squared ($L^2$), and volume is length cubed ($L^3$).
They can also be represented by these units a negative number of times; for example,
frequency is the reciprocal of time ($T^{-1}$).
Furthermore, they can be represented by combinations of these base units:
force, for example, is $M \times L \times T^{-2}$.

(See [here](https://en.wikipedia.org/wiki/Dimensional_analysis) for a more complete explanation of dimensions.)

The vast majority of useful units can be represented with only the first three,
so KMeasure only supports combinations of mass, length, and time for now.

### `Dimension` Declarations
Thus, `Dimension` takes three type parameters:
```kotlin
class Dimension<M : BaseMassDimension, L : BaseLengthDimension, T : BaseTimeDimension> private constructor()
```
Each of the base dimensions has a set of subtypes. For example, here's `BaseMassDimension`:
```kotlin
sealed interface BaseMassDimension
sealed interface MassN2 : BaseMassDimension
sealed interface MassN1 : BaseMassDimension
sealed interface Mass0 : BaseMassDimension
sealed interface Mass1 : BaseMassDimension
sealed interface Mass2 : BaseMassDimension
```
Each of these subtypes represents a "power" of mass. For example, `Mass2` represents mass squared ($M^2$).
(Subtypes with an `N` represent negative powers—kotlin doesn't allow negative signs as part of identifiers.
`MassN1` therefore represents the reciprocal of mass, or $M^{-1}$).

With the three type parameters of `Dimension` together, any combination of these base
dimensions—and therefore any[^1] dimension—can be represented.
Take force from before, which was $M \times L \times T^{-2}$.
That would be represented in KMeasure as being of type `Dimension<Mass1, Length1, TimeN2>`

Now, the compiler will automatically distinguish between different dimensions, and won't allow
operations (such as addition, subtraction, etc.) between Quantities with different Dimensions.

[^1]: You may have noticed that powers of Mass ony go up to 2 and down to -2; this was chosen deliberately
as no commonly used units involve mass squared or anything of the like. More powers could be added,
but at the cost of significantly increased code size—see [Limitations](#Limitations).
### Typealiases
KMeasure also provides many typealiases so that you don't have to type out that long declaration for dimensions.
Here are a few examples:
```kotlin
typealias MassDimension = Dimension<Mass1, Length0, Time0>
typealias MomentumDimension = Dimension<Mass1, Length1, TimeN1>
typealias ForceDimension = Dimension<Mass1, Length1, TimeN2>
typealias PressureDimension = Dimension<Mass1, LengthN1, TimeN2>
typealias EnergyDimension = Dimension<Mass1, Length2, TimeN2>
// etc...
```
Typealiases are also provided for Quantities so that you don't even have to write out `Quantity<MassDimension>`;
you can just write `Mass`. For example:
```kotlin
typealias Mass = Quantity<MassDimension>
typealias Momentum = Quantity<MomentumDimension>
typealias Force = Quantity<ForceDimension>
typealias Pressure = Quantity<PressureDimension>
typealias Energy = Quantity<EnergyDimension>
// etc...
```

### Multiplication and Division
At this point, only one thing is left: multiplication and division.
These operations are different from addition and subtraction in that you can multiply and divide
any unit by any other unit, and it'll return yet a different unit.
For example, distance divided by time gives a velocity.

Unfortunately, there is no way to allow the Kotlin compiler to automatically determine what unit
a multiplication or division should return. Instead, a function has to be defined for each
possible multiplication and division—every possible combination of two units.
Needless to say, this is a lot of functions, so they're autogenerated using a [script](codegen/mutliplicationDivision.kts).

# Limitations
### Limited Supported Dimensions
Since each combination of every two dimensions needs to have two functions,
one for multiplication and one for division, the number of multiplication/division functions is
$2(d-1)!$ where $d$ is the number of dimensions. Since the number of dimensions is equal to
$m \times l \times t$, where $m$, $l$, and $t$ are the number of mass, length, and time dimensions, respectively,
the required number of multiplication/division functions is $2(mlt-1)!$ (or, more clearly,
$ O((mlt)!) $). As is evident by the factorial term, adding more dimensions therefore significantly increases
the number of functions needing to be defined, slowing down things like intellisense and compilation.

Thus, only certain dimensions are supported. Those that are supported were chosen to include all commonly-used
mechanical units, so issues arising from this are likely to be rare. Certain very complex expressions
may run into errors, but may be fixed with rearrangement through parenthesis.

### Scalar/Double Nonequivalence
Semantically, `Scalar(1.0)` and `1.0` represent the same dimensionless value of 1.0.
In typical usage, it is recommended to use `Double`s to represent dimensionless values,
but it is sometimes necessary to use `Scalar`s, such as when a type is needed to implement
the `Quantity<D>` interface. This may occur with classes or functions that take
an arbitrary unit as a generic type parameter.
