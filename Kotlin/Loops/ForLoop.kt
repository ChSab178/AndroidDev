
/*
    KOTLIN FOR LOOP

    A for loop is used when you want to repeat a block of code
    for each value in a range, collection, or sequence.

    Basic syntax:

    for (variable in range) {
        // code to repeat
    }
*/


fun main() {

    // --------------------------------------------------
    // 1. Basic for loop
    // --------------------------------------------------

    for (i in 1..5) {
        println(i)
    }

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5


    // --------------------------------------------------
    // 2. Range with ..
    // --------------------------------------------------
    // 1..5 means: 1, 2, 3, 4, 5
    // The ending value IS included.

    for (i in 1..5) {
        println("Number: $i")
    }


    // --------------------------------------------------
    // 3. until
    // --------------------------------------------------
    // 1 until 5 means: 1, 2, 3, 4
    // The ending value is NOT included.

    for (i in 1 until 5) {
        println(i)
    }


    // --------------------------------------------------
    // 4. downTo
    // --------------------------------------------------
    // Used when you want to count backwards.

    for (i in 5 downTo 1) {
        println(i)
    }

    // Output:
    // 5
    // 4
    // 3
    // 2
    // 1


    // --------------------------------------------------
    // 5. step
    // --------------------------------------------------
    // step controls how much the value changes each time.

    for (i in   step 2) {
        println(i)
    }

    // Output:
    // 1
    // 3
    // 5
    // 7
    // 9


    // --------------------------------------------------
    // 6. Loop through a String
    // --------------------------------------------------
    // The loop visits each character one by one.

    for (char in "Kotlin") {
        println(char)
    }

    // Output:
    // K
    // o
    // t
    // l
    // i
    // n


    // --------------------------------------------------
    // 7. Loop through a List
    // --------------------------------------------------

    val fruits = listOf("Apple", "Banana", "Mango")

    for (fruit in fruits) {
        println(fruit)
    }


    // --------------------------------------------------
    // 8. Using index with indices
    // --------------------------------------------------
    // indices gives the valid indexes of a collection.

    for (index in fruits.indices) {
        println("$index: ${fruits[index]}")
    }

    // Output:
    // 0: Apple
    // 1: Banana
    // 2: Mango


    // --------------------------------------------------
    // 9. break
    // --------------------------------------------------
    // break immediately stops the loop.

    for (i in 1..10) {
        if (i == 5) {
            break
        }

        println(i)
    }

    // Output:
    // 1
    // 2
    // 3
    // 4


    // --------------------------------------------------
    // 10. continue
    // --------------------------------------------------
    // continue skips the current iteration
    // and moves to the next one.

    for (i in 1..5) {
        if (i == 3) {
            continue
        }

        println(i)
    }

    // Output:
    // 1
    // 2
    // 4
    // 5
}


/*
    IMPORTANT SYNTAX TO REMEMBER

    1..5
    -> 1, 2, 3, 4, 5

    1 until 5
    -> 1, 2, 3, 4

    5 downTo 1
    -> 5, 4, 3, 2, 1

    1..10 step 2
    -> 1, 3, 5, 7, 9

    break
    -> completely stops the loop

    continue
    -> skips the current iteration
*/
