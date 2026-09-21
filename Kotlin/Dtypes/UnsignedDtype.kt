// UnsignedDtype :

fun main() {

    // ============================================================
    // KOTLIN UNSIGNED INTEGER TYPES
    // ============================================================
    //
    // Unsigned = can store 0 and positive numbers only.
    //
    // UByte  ->  8-bit  ->  0 .. 255
    // UShort -> 16-bit  ->  0 .. 65,535
    // UInt   -> 32-bit  ->  0 .. 4,294,967,295
    // ULong  -> 64-bit  ->  0 .. 18,446,744,073,709,551,615
    //
    // The "U" means Unsigned.
    // ============================================================


    // ------------------------------------------------------------
    // 1. UByte
    // ------------------------------------------------------------
    // Unsigned version of Byte.
    // Range: 0 .. 255

    val byteValue: UByte = 255u

    println(byteValue)


    // ------------------------------------------------------------
    // 2. UShort
    // ------------------------------------------------------------
    // Unsigned version of Short.
    // Range: 0 .. 65,535

    val shortValue: UShort = 65_535u

    println(shortValue)


    // ------------------------------------------------------------
    // 3. UInt
    // ------------------------------------------------------------
    // Unsigned version of Int.
    // Range: 0 .. 4,294,967,295

    val intValue: UInt = 4_000_000_000u

    println(intValue)


    // ------------------------------------------------------------
    // 4. ULong
    // ------------------------------------------------------------
    // Unsigned version of Long.
    // Range:
    // 0 .. 18,446,744,073,709,551,615

    // "uL" means Unsigned Long.
    val longValue: ULong = 18_000_000_000_000_000_000uL

    println(longValue)


    // ============================================================
    // UNSIGNED LITERALS
    // ============================================================

    // "u" tells Kotlin that the number is unsigned.
    val a = 100u

    // "uL" tells Kotlin that the number is an unsigned Long.
    val b = 100uL

    println(a)
    println(b)


    // ============================================================
    // ARITHMETIC
    // ============================================================

    val x: UInt = 100u
    val y: UInt = 50u

    val addition = x + y
    val subtraction = x - y
    val multiplication = x * y

    println(addition)       // 150
    println(subtraction)    // 50
    println(multiplication) // 5000


    // ============================================================
    // CONVERSIONS
    // ============================================================
    //
    // Unsigned types are different types from Int/Long.
    // Use conversion functions when necessary.

    val normalInt: Int = 100

    val unsignedInt: UInt = normalInt.toUInt()

    println(unsignedInt)


    val anotherUInt: UInt = 500u

    val convertedInt: Int = anotherUInt.toInt()

    println(convertedInt)


    // ============================================================
    // IMPORTANT: RANGE MATTERS WHEN CONVERTING
    // ============================================================

    // This value is valid for UInt:
    val largeNumber: UInt = 4_000_000_000u

    // But 4,000,000,000 cannot normally be represented
    // as a positive Int because Int's maximum is:
    // 2,147,483,647

    println(largeNumber)


    // ============================================================
    // PRACTICAL EXAMPLE: RGB COLOR
    // ============================================================
    //
    // Each RGB component can have a value from 0 to 255.
    // UByte can represent this range exactly.

    val red: UByte = 255u
    val green: UByte = 128u
    val blue: UByte = 50u

    println("RGB: $red, $green, $blue")


    // ============================================================
    // PRACTICAL EXAMPLE: BIT FLAGS
    // ============================================================
    //
    // Unsigned integers can be useful when working with
    // binary data and bit manipulation.

    val flags: UInt = 0b1010u

    println(flags)


    // ============================================================
    // IMPORTANT RULE
    // ============================================================
    //
    // Don't use unsigned types just because a value is positive.
    //
    // Normal application values usually use:
    //
    // Int
    // Long
    //
    // Unsigned types are mainly useful for:
    //
    // - Binary data
    // - File formats
    // - Network protocols
    // - Hardware/embedded programming
    // - Bit manipulation
    // - Interoperability with unsigned data
    //
    // Example:
    //
    // Normal application:
    val age: Int = 18

    // Binary/protocol data:
    val packetValue: UInt = 4_000_000_000u

    println(age)
    println(packetValue)
}
/*
```

### Quick memory table

```text
Type       Bits       Range

UByte       8         0 .. 255

UShort     16         0 .. 65,535

UInt       32         0 .. 4,294,967,295

ULong      64         0 .. 18,446,744,073,709,551,615
```

### The suffixes to remember

```text
100u       → unsigned integer literal
100uL      → unsigned Long literal
```

The main idea is simply:

```text
UByte  = unsigned Byte
UShort = unsigned Short
UInt   = unsigned Int
ULong  = unsigned Long
```

Use `Int`/`Long` for most normal Kotlin application code; use unsigned types when the **data itself is naturally unsigned or fixed-width**.

```

If you want, I can also make the next `.kt` file covering **`Byte`, `Short`, `Int`, `Long`, `UByte`, `UShort`, `UInt`, `ULong`, `Float`, and `Double` together** as one complete Kotlin numeric-types reference.
```
*/
