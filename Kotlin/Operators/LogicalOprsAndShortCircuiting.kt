
fun main() {

    // ============================================================
    // KOTLIN LOGICAL OPERATORS
    // ============================================================
    //
    // Logical operators are used to combine or reverse Boolean
    // expressions.
    //
    // Kotlin has three main logical operators:
    //
    // &&  AND
    // ||  OR
    // !   NOT
    //
    // They work with Boolean values: true or false.


    // ============================================================
    // 1. AND (&&)
    // ============================================================
    //
    // Returns true ONLY when both conditions are true.
    //
    // true  && true  -> true
    // true  && false -> false
    // false && true  -> false
    // false && false -> false

    val age = 20
    val hasId = true

    println(age >= 18 && hasId) // true

    // Meaning:
    // age >= 18 must be true
    // AND
    // hasId must also be true.


    // ============================================================
    // 2. OR (||)
    // ============================================================
    //
    // Returns true when AT LEAST ONE condition is true.
    //
    // true  || true  -> true
    // true  || false -> true
    // false || true  -> true
    // false || false -> false

    val isAdmin = false
    val isOwner = true

    println(isAdmin || isOwner) // true

    // Only one condition needs to be true.


    // ============================================================
    // 3. NOT (!)
    // ============================================================
    //
    // Reverses a Boolean value.
    //
    // !true  -> false
    // !false -> true

    val loggedIn = true

    println(!loggedIn) // false

    // !loggedIn means:
    // "loggedIn is NOT true"


    // ============================================================
    // COMBINING LOGICAL OPERATORS
    // ============================================================

    val userAge = 25
    val verified = true
    val banned = false

    val canAccess = userAge >= 18 && verified && !banned

    println(canAccess) // true

    // The user must:
    // 1. Be 18 or older
    // 2. Be verified
    // 3. NOT be banned


    // ============================================================
    // SHORT-CIRCUITING
    // ============================================================
    //
    // Kotlin's && and || use short-circuit evaluation.
    //
    // Short-circuiting means Kotlin may NOT evaluate the
    // expression on the right side because its result is
    // already known from the left side.


    // -------------------------
    // && SHORT-CIRCUITING
    // -------------------------
    //
    // If the LEFT side of && is false,
    // the whole expression MUST be false.
    //
    // Therefore, Kotlin does NOT evaluate the right side.

    val result1 = false && (10 / 0 == 5)

    // The division by zero is NOT executed because
    // the left side is already false.

    println(result1) // false


    // -------------------------
    // || SHORT-CIRCUITING
    // -------------------------
    //
    // If the LEFT side of || is true,
    // the whole expression MUST be true.
    //
    // Therefore, Kotlin does NOT evaluate the right side.

    val result2 = true || (10 / 0 == 5)

    // The division by zero is NOT executed because
    // the left side is already true.

    println(result2) // true


    // ============================================================
    // PRACTICAL EXAMPLE
    // ============================================================

    val username: String? = null

    // && prevents the second condition from being evaluated
    // when username == null.

    if (username != null && username.length > 3) {
        println("Valid username")
    }

    // First:
    // username != null
    //
    // If this is false, Kotlin stops and does NOT execute:
    // username.length > 3
    //
    // This prevents accessing length on a null value.


    // ============================================================
    // && vs || SHORT-CIRCUIT RULE
    // ============================================================
    //
    // &&:
    // false -> stop
    // true  -> continue checking
    //
    // ||:
    // true  -> stop
    // false -> continue checking


    // Example:

    val a = false
    val b = true

    println(a && b) // false
    // a is false, so b doesn't need to be checked.

    println(a || b) // true
    // a is false, so Kotlin must check b.


    // ============================================================
    // IMPORTANT
    // ============================================================
    //
    // && and || are short-circuiting operators.
    //
    // Do NOT confuse them with:
    //
    // and()
    // or()
    //
    // Kotlin also provides these functions for Boolean values,
    // but they do NOT short-circuit in the same way.
}
/*
```

**Core thing to remember:**

* `&&` → **both must be true**
* `||` → **at least one must be true**
* `!` → **reverses true/false**
* `false && anything` → stops early
* `true || anything` → stops early

This short-circuit behavior becomes especially important with **null checks, function calls, expensive operations, and conditions that could otherwise cause errors**.
*/
