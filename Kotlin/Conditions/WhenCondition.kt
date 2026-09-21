
fun main() {

    // =========================================================
    // KOTLIN `when` CONDITION
    // =========================================================
    //
    // `when` is Kotlin's way of checking multiple conditions.
    // It is similar to:
    //   - switch in C/C++/Java
    //   - match in some other languages
    //
    // Use `when` when you have multiple possible cases.
    //
    // Basic syntax:
    //
    // when (value) {
    //     case1 -> code
    //     case2 -> code
    //     else -> code
    // }


    // ---------------------------------------------------------
    // 1. Basic `when`
    // ---------------------------------------------------------

    val day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend or invalid day")
    }

    // `else` runs when none of the cases match.
    // It is similar to `default` in a switch statement.


    // ---------------------------------------------------------
    // 2. Multiple values in one case
    // ---------------------------------------------------------

    val number = 2

    when (number) {
        1, 2, 3 -> println("Small number")
        4, 5, 6 -> println("Medium number")
        else -> println("Other number")
    }

    // Use commas when multiple values should produce
    // the same result.


    // ---------------------------------------------------------
    // 3. `when` with ranges
    // ---------------------------------------------------------

    val marks = 85

    when (marks) {
        in 90..100 -> println("Grade A+")
        in 80..89 -> println("Grade A")
        in 70..79 -> println("Grade B")
        in 60..69 -> println("Grade C")
        else -> println("Fail")
    }

    // `in` checks whether a value exists inside a range.


    // ---------------------------------------------------------
    // 4. `when` without a value
    // ---------------------------------------------------------

    val age = 20

    when {
        age < 13 -> println("Child")
        age < 18 -> println("Teenager")
        age >= 18 -> println("Adult")
    }

    // Without a value, `when` works like multiple if/else-if
    // conditions.


    // ---------------------------------------------------------
    // 5. `when` with Strings
    // ---------------------------------------------------------

    val animal = "cat"

    when (animal) {
        "cat" -> println("Meow")
        "dog" -> println("Woof")
        "cow" -> println("Moo")
        else -> println("Unknown animal")
    }


    // ---------------------------------------------------------
    // 6. `when` can return a value
    // ---------------------------------------------------------

    val number2 = 10

    val result = when {
        number2 > 0 -> "Positive"
        number2 < 0 -> "Negative"
        else -> "Zero"
    }

    println(result)

    // This is one of the powerful features of Kotlin.
    // `when` is an expression, so it can produce a value.


    // ---------------------------------------------------------
    // 7. Using `when` with a variable
    // ---------------------------------------------------------

    val score = 75

    val grade = when (score) {
        in 90..100 -> "A+"
        in 80..89 -> "A"
        in 70..79 -> "B"
        in 60..69 -> "C"
        else -> "F"
    }

    println("Grade: $grade")


    // =========================================================
    // WHEN TO USE `when`
    // =========================================================
    //
    // Use `when` when:
    //
    // 1. You have multiple possible values.
    // 2. You need to compare one value against many cases.
    // 3. You want cleaner code than many if/else-if statements.
    // 4. You need to return a value based on different cases.
    //
    // Example:
    //
    // if (day == 1) { ... }
    // else if (day == 2) { ... }
    // else if (day == 3) { ... }
    //
    // can often become:
    //
    // when (day) {
    //     1 -> ...
    //     2 -> ...
    //     3 -> ...
    // }


    // =========================================================
    // QUICK SYNTAX
    // =========================================================
    //
    // when (value) {
    //     value1 -> code
    //     value2 -> code
    //     in range -> code
    //     else -> code
    // }
    //
    // OR:
    //
    // when {
    //     condition1 -> code
    //     condition2 -> code
    //     else -> code
    // }
}
