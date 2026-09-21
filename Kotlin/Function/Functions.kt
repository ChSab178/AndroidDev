
/*
    KOTLIN FUNCTIONS
    =================

    A function is a reusable block of code that performs a task.

    Basic syntax:

    fun functionName(parameters): ReturnType {
        // code
        return value
    }
*/


fun main() {

    // ------------------------------------------------------------
    // 1. BASIC FUNCTION
    // ------------------------------------------------------------

    greet()

    // Output:
    // Hello!


    // ------------------------------------------------------------
    // 2. FUNCTION WITH PARAMETERS
    // ------------------------------------------------------------

    greetUser("Hammad")

    // Output:
    // Hello, Hammad!


    // ------------------------------------------------------------
    // 3. RETURN TYPE
    // ------------------------------------------------------------

    val result = add(10, 20)

    println(result)

    // add() returns an Int.
    // result = 30


    // ------------------------------------------------------------
    // 4. UNIT RETURN TYPE
    // ------------------------------------------------------------

    sayHello()

    /*
        Unit means the function does not return a useful value.

        This:

            fun sayHello() {
                println("Hello")
            }

        is effectively:

            fun sayHello(): Unit {
                println("Hello")
            }

        Unit is similar to void in languages such as C/C++/Java,
        but Unit is an actual Kotlin type.
    */


    // ------------------------------------------------------------
    // 5. EXPRESSION-BODY FUNCTION
    // ------------------------------------------------------------

    println(square(5))

    /*
        Instead of:

            fun square(number: Int): Int {
                return number * number
            }

        You can write:

            fun square(number: Int) = number * number

        Kotlin automatically infers the return type as Int.
    */


    // ------------------------------------------------------------
    // 6. EXPLICIT RETURN TYPE
    // ------------------------------------------------------------

    println(multiply(5, 4))

    /*
        Explicit return types are useful when:

        - The return type should be obvious to readers
        - The function is public API
        - You want strict control over the function's contract
    */


    // ------------------------------------------------------------
    // 7. DEFAULT PARAMETERS
    // ------------------------------------------------------------

    createUser("Hammad")

    createUser("Hammad", 18)

    /*
        If age isn't provided, Kotlin uses the default value.
    */


    // ------------------------------------------------------------
    // 8. NAMED ARGUMENTS
    // ------------------------------------------------------------

    createUser(
        name = "Hammad",
        age = 18
    )

    /*
        Named arguments make function calls easier to understand,
        especially when multiple parameters have similar types.
    */


    // ------------------------------------------------------------
    // 9. VARARG
    // ------------------------------------------------------------

    printNumbers(10, 20, 30, 40, 50)

    /*
        vararg allows a function to receive any number of arguments.

        Inside the function, numbers behaves like an Array.
    */


    // ------------------------------------------------------------
    // 10. INLINE FUNCTION
    // ------------------------------------------------------------

    inlineExample {
        println("Code inside lambda")
    }

    /*
        inline tells Kotlin that the compiler can replace the
        function call with the function's body at compile time.

        It is mainly useful with higher-order functions/lambdas
        to reduce some function/lambda call overhead.

        IMPORTANT:
        Don't add inline everywhere.
        Use it mainly when there is a real reason, especially
        with higher-order functions.
    */


    // ------------------------------------------------------------
    // 11. NOTHING RETURN TYPE
    // ------------------------------------------------------------

    /*
        A function returning Nothing NEVER successfully returns.

        Example:

            fun crash(): Nothing {
                throw Exception("Something went wrong")
            }

        Nothing is useful for functions that:

        - Always throw an exception
        - Never finish normally
        - Terminate execution
    */


    // ------------------------------------------------------------
    // 12. RETURNING FROM A FUNCTION
    // ------------------------------------------------------------

    println(checkAge(20))
}


// ================================================================
// FUNCTION DEFINITIONS
// ================================================================


// Basic function
fun greet() {
    println("Hello!")
}


// Function with parameter
fun greetUser(name: String) {
    println("Hello, $name!")
}


// Function returning a value
fun add(a: Int, b: Int): Int {
    return a + b
}


// Unit return type
fun sayHello(): Unit {
    println("Hello!")
}


// Expression-body function
fun square(number: Int) = number * number


// Explicit return type
fun multiply(a: Int, b: Int): Int {
    return a * b
}


// Default parameter
fun createUser(name: String, age: Int = 18) {
    println("Name: $name, Age: $age")
}


// vararg parameter
fun printNumbers(vararg numbers: Int) {

    for (number in numbers) {
        println(number)
    }
}


// Inline function
inline fun inlineExample(action: () -> Unit) {
    action()
}


// Function returning Boolean
fun checkAge(age: Int): Boolean {
    return age >= 18
}


/*
    ================================================================
    IMPORTANT FUNCTION RETURN TYPES
    ================================================================

    Int
        Returns an integer.

        fun getAge(): Int {
            return 18
        }


    String
        Returns text.

        fun getName(): String {
            return "Hammad"
        }


    Boolean
        Returns true/false.

        fun isAdult(): Boolean {
            return true
        }


    Double
        Returns decimal number.

        fun getPrice(): Double {
            return 99.99
        }


    Unit
        Returns no useful value.

        fun printMessage() {
            println("Hello")
        }


    Nothing
        Function never successfully returns.

        fun fail(): Nothing {
            throw Exception("Failed")
        }


    ================================================================
    FUNCTION PARAMETERS
    ================================================================

    Normal parameter:

        fun greet(name: String)


    Multiple parameters:

        fun add(a: Int, b: Int)


    Default parameter:

        fun greet(name: String = "Guest")


    Named arguments:

        greet(name = "Hammad")


    Variable number of arguments:

        fun sum(vararg numbers: Int)


    ================================================================
    FUNCTION OVERLOADING
    ================================================================

    You can have multiple functions with the same name if their
    parameter lists are different.

        fun add(a: Int, b: Int): Int {
            return a + b
        }

        fun add(a: Double, b: Double): Double {
            return a + b
        }

    Kotlin chooses the appropriate function based on the arguments.


    ================================================================
    LOCAL FUNCTIONS
    ================================================================

    A function can be declared inside another function.

        fun outer() {

            fun inner() {
                println("Inside inner")
            }

            inner()
        }

    Local functions are useful when a helper function is only
    needed inside one particular function.


    ================================================================
    HIGHER-ORDER FUNCTIONS
    ================================================================

    Kotlin functions can receive other functions as parameters
    or return functions.

        fun calculate(
            a: Int,
            b: Int,
            operation: (Int, Int) -> Int
        ): Int {
            return operation(a, b)
        }

    Example:

        val result = calculate(10, 5) { x, y ->
            x + y
        }

    This is a major Kotlin feature and is heavily used with
    collections, Android, Compose, coroutines, etc.


    ================================================================
    FUNCTION TYPES
    ================================================================

    (Int, Int) -> Int

    Means:

        Takes two Int values
        Returns an Int


    () -> Unit

    Means:

        Takes nothing
        Returns Unit


    (String) -> Boolean

    Means:

        Takes a String
        Returns Boolean


    ================================================================
    QUICK RULE
    ================================================================

    fun name(parameters): ReturnType {
        return value
    }

    OR for simple expressions:

    fun name(parameters) = expression


    Most important concepts to learn first:

    1. Parameters
    2. Return values
    3. Unit
    4. Expression-body functions
    5. Default/named arguments
    6. vararg
    7. Function types
    8. Higher-order functions
    9. Lambdas
    10. inline
    11. Nothing
*/
