
fun main() {

    // ============================================================
    // KOTLIN RANGES
    // ============================================================
    // A range represents a sequence of values from a starting value
    // to an ending value.
    //
    // Syntax:
    // start..end
    //
    // IMPORTANT:
    // `..` INCLUDES the end value.


    // Example:
    val numbers = 1..5

    println(numbers)        // 1..5
    println(numbers.toList()) // [1, 2, 3, 4, 5]


    // ------------------------------------------------------------
    // 1. Using a range with for loop
    // ------------------------------------------------------------

    for (i in 1..5) {
        println(i)
    }

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5


    // ------------------------------------------------------------
    // 2. Checking if a value is inside a range
    // ------------------------------------------------------------

    val age = 18

    println(age in 1..100)       // true
    println(age !in 1..17)       // true

    // `in`  -> checks whether a value exists in the range.
    // `!in` -> checks whether a value does NOT exist in the range.


    // ============================================================
    // UNTIL
    // ============================================================
    // `until` creates a range where the END value is EXCLUDED.
    //
    // Syntax:
    // start until end
    //
    // Example:
    // 1 until 5 -> 1, 2, 3, 4
    //
    // So:
    // 1..5       -> 1, 2, 3, 4, 5
    // 1 until 5  -> 1, 2, 3, 4


    // ------------------------------------------------------------
    // 3. Using until with a for loop
    // ------------------------------------------------------------

    for (i in 1 until 5) {
        println(i)
    }

    // Output:
    // 1
    // 2
    // 3
    // 4


    // ------------------------------------------------------------
    // 4. Range vs until
    // ------------------------------------------------------------

    val range = 1..5
    val untilRange = 1 until 5

    println(range.toList())
    // [1, 2, 3, 4, 5]

    println(untilRange.toList())
    // [1, 2, 3, 4]


    // ============================================================
    // DOWNTO
    // ============================================================
    // `downTo` creates a decreasing range.
    //
    // Example:
    // 5 downTo 1 -> 5, 4, 3, 2, 1

    for (i in 5 downTo 1) {
        println(i)
    }


    // ============================================================
    // STEP
    // ============================================================
    // `step` controls how much the value changes each iteration.
    //
    // Example:
    // 1..10 step 2 -> 1, 3, 5, 7, 9

    for (i in 1..10 step 2) {
        println(i)
    }

    // With downTo:
    // 10 downTo 1 step 2 -> 10, 8, 6, 4, 2

    for (i in 10 downTo 1 step 2) {
        println(i)
    }


    // ============================================================
    // QUICK SUMMARY
    // ============================================================
    //
    // 1..5
    // -> 1, 2, 3, 4, 5
    // -> END INCLUDED
    //
    // 1 until 5
    // -> 1, 2, 3, 4
    // -> END EXCLUDED
    //
    // 5 downTo 1
    // -> 5, 4, 3, 2, 1
    //
    // 1..10 step 2
    // -> 1, 3, 5, 7, 9
    //
    // 10 downTo 1 step 2
    // -> 10, 8, 6, 4, 2
}
