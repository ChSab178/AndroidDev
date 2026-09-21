
fun main() {

    /*
    ============================================================
    KOTLIN: while AND do-while LOOPS
    ============================================================

    A loop repeats a block of code while a condition is true.

    Kotlin has:
    - while
    - do-while
    - for

    This file focuses only on while and do-while.
    */


    // ============================================================
    // 1. while LOOP
    // ============================================================

    /*
    Syntax:

    while (condition) {
        // code
    }

    The condition is checked BEFORE the loop body runs.

    If the condition is false from the beginning,
    the loop will execute ZERO times.
    */

    var count = 1

    while (count <= 5) {
        println(count)
        count++
    }

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5


    // ============================================================
    // 2. IMPORTANT: UPDATE THE VARIABLE
    // ============================================================

    /*
    Usually, something inside the loop must change
    so that the condition eventually becomes false.

    If you forget count++, the loop can become infinite.

    Example:

    var count = 1

    while (count <= 5) {
        println(count)

        // count++ is missing!
    }

    This keeps printing 1 forever.
    */


    // ============================================================
    // 3. while WITH USER INPUT
    // ============================================================

    /*
    A while loop is useful when you don't know exactly
    how many times something should repeat.

    Example: keep asking until the user enters "exit".
    */

    var input = ""

    while (input != "exit") {
        print("Enter something (type exit to stop): ")
        input = readln()
    }

    println("Loop ended.")


    // ============================================================
    // 4. do-while LOOP
    // ============================================================

    /*
    Syntax:

    do {
        // code
    } while (condition)

    The important difference:

    while:
        condition -> body

    do-while:
        body -> condition

    Therefore, do-while ALWAYS runs at least once.
    */

    var number = 1

    do {
        println(number)
        number++
    } while (number <= 5)

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5


    // ============================================================
    // 5. while vs do-while
    // ============================================================

    /*
    while checks the condition FIRST.
    */

    var x = 10

    while (x < 5) {
        println("while ran")
    }

    // Nothing is printed because 10 < 5 is false.


    /*
    do-while checks the condition AFTER running the body.
    */

    var y = 10

    do {
        println("do-while ran")
    } while (y < 5)

    // Output:
    // do-while ran

    // Even though 10 < 5 is false,
    // the body ran once.


    // ============================================================
    // 6. break
    // ============================================================

    /*
    'break' immediately stops the loop.
    */

    var i = 1

    while (i <= 10) {

        if (i == 6) {
            break
        }

        println(i)
        i++
    }

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5


    // ============================================================
    // 7. continue
    // ============================================================

    /*
    'continue' skips the current iteration
    and moves to the next iteration.
    */

    var n = 0

    while (n < 5) {
        n++

        if (n == 3) {
            continue
        }

        println(n)
    }

    // Output:
    // 1
    // 2
    // 4
    // 5


    // ============================================================
    // QUICK SUMMARY
    // ============================================================

    /*
    while:

        while (condition) {
            // code
        }

        -> Checks condition first.
        -> May execute ZERO times.

    do-while:

        do {
            // code
        } while (condition)

        -> Runs code first.
        -> Checks condition afterward.
        -> Always executes AT LEAST ONCE.

    break:
        -> Completely stops the loop.

    continue:
        -> Skips the current iteration.
    */
}
