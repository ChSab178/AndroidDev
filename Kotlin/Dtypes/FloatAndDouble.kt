fun main() {

    // ============================================================
    // FLOAT
    // ============================================================

    // Float stores decimal/floating-point numbers.
    // It uses 32 bits and provides about 6–7 decimal digits of precision.

    val temperature: Float = 36.5f

    // The 'f' or 'F' suffix tells Kotlin that the value is a Float.
    // Without 'f', decimal literals are Double by default.

    println(temperature)


    // You can use Float for values where extremely high precision
    // is not required.

    val height: Float = 5.9f
    val speed: Float = 120.5f

    println(height)
    println(speed)


    // ============================================================
    // DOUBLE
    // ============================================================

    // Double also stores decimal/floating-point numbers.
    // It uses 64 bits and provides about 15–16 decimal digits
    // of precision.

    val pi: Double = 3.141592653589793

    // Double is the default type for decimal numbers.
    // So this is also a Double:
    val number = 10.5

    println(pi)
    println(number)


    // ============================================================
    // FLOAT vs DOUBLE
    // ============================================================

    // Float  -> 32 bits -> ~6–7 digits precision
    // Double -> 64 bits -> ~15–16 digits precision

    val floatNumber: Float = 10.1234567f
    val doubleNumber: Double = 10.123456789012345

    println(floatNumber)
    println(doubleNumber)


    // ============================================================
    // ARITHMETIC OPERATIONS
    // ============================================================

    val a: Double = 10.5
    val b: Double = 2.5

    println(a + b)  // Addition
    println(a - b)  // Subtraction
    println(a * b)  // Multiplication
    println(a / b)  // Division


    // ============================================================
    // TYPE CONVERSION
    // ============================================================

    val intNumber: Int = 10

    // Int -> Double
    val convertedDouble: Double = intNumber.toDouble()

    // Int -> Float
    val convertedFloat: Float = intNumber.toFloat()

    println(convertedDouble)
    println(convertedFloat)


    // Double -> Int
    // Decimal part is removed.
    val x: Double = 10.99
    val y: Int = x.toInt()

    println(y) // 10


    // ============================================================
    // FLOAT PRECISION
    // ============================================================

    val floatValue: Float = 1.123456789f

    // Float cannot accurately store unlimited decimal digits.
    // Some digits may be rounded because Float has limited precision.

    println(floatValue)


    // ============================================================
    // DOUBLE PRECISION
    // ============================================================

    val doubleValue: Double = 1.1234567890123456789

    // Double has much more precision than Float,
    // but it is still not perfectly precise for every decimal number.

    println(doubleValue)


    // ============================================================
    // SCIENTIFIC NOTATION
    // ============================================================

    val largeNumber: Double = 1.5e10
    val smallNumber: Double = 1.5e-5

    println(largeNumber)
    println(smallNumber)


    // ============================================================
    // WHEN TO USE WHICH?
    // ============================================================

    // Double:
    // Usually the default choice for decimal calculations.
    //
    // Examples:
    // scientific calculations
    // measurements
    // coordinates
    // general mathematical calculations

    val distance: Double = 123.456789


    // Float:
    // Use when lower memory usage or a specific 32-bit format
    // is important.
    //
    // Common examples:
    // graphics
    // games
    // some Android/Java APIs
    // large collections of floating-point values

    val gamePosition: Float = 125.5f

    println(distance)
    println(gamePosition)
}
