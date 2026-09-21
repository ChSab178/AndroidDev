
fun main() {

    // ============================================================
    // KOTLIN: if, if-else, and else
    // ============================================================

    /*
     * `if` is used to execute code only when a condition is true.
     *
     * Syntax:
     *
     * if (condition) {
     *     // code runs if condition is true
     * }
     */

    val age = 20

    if (age >= 18) {
        println("You are an adult")
    }


    // ============================================================
    // 1. if
    // ============================================================

    /*
     * The condition inside `if` must produce a Boolean:
     *
     * true  -> block runs
     * false -> block is skipped
     */

    val temperature = 35

    if (temperature > 30) {
        println("It is hot")
    }


    // ============================================================
    // 2. if-else
    // ============================================================

    /*
     * `else` runs when the `if` condition is false.
     *
     * Syntax:
     *
     * if (condition) {
     *     // true
     * } else {
     *     // false
     * }
     */

    val number = 10

    if (number > 0) {
        println("Positive number")
    } else {
        println("Zero or negative number")
    }


    // ============================================================
    // 3. if-else with comparison
    // ============================================================

    val age2 = 16

    if (age2 >= 18) {
        println("You can vote")
    } else {
        println("You cannot vote yet")
    }


    // ============================================================
    // 4. Multiple conditions: else if
    // ============================================================

    /*
     * `else if` lets us check multiple conditions.
     *
     * Kotlin checks them from top to bottom.
     * The first true condition is executed.
     */

    val marks = 85

    if (marks >= 90) {
        println("Grade A+")
    } else if (marks >= 80) {
        println("Grade A")
    } else if (marks >= 70) {
        println("Grade B")
    } else if (marks >= 60) {
        println("Grade C")
    } else {
        println("Fail")
    }


    // ============================================================
    // 5. if as an expression
    // ============================================================

    /*
     * In Kotlin, `if` can return a value.
     *
     * This is useful when you want to assign the result
     * of a condition to a variable.
     */

    val age3 = 20

    val status = if (age3 >= 18) {
        "Adult"
    } else {
        "Minor"
    }

    println(status)


    // Short form:
    val max = if (10 > 5) 10 else 5

    println(max)


    // ============================================================
    // 6. Important: Kotlin has no ternary operator
    // ============================================================

    /*
     * Languages such as JavaScript have:
     *
     * condition ? value1 : value2
     *
     * Kotlin does NOT have a separate ternary operator.
     *
     * Instead, use:
     *
     * if (condition) value1 else value2
     */

    val result = if (10 > 5) "Yes" else "No"

    println(result)


    // ============================================================
    // QUICK SUMMARY
    // ============================================================

    /*
     * if
     * -> Runs code when a condition is true.
     *
     * if-else
     * -> Chooses between two possibilities.
     *
     * else
     * -> Runs when the previous `if` condition is false.
     *
     * else if
     * -> Allows checking multiple conditions.
     *
     * Kotlin's if can also return a value.
     */

}

