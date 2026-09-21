/**
 * ============================================================
 *  Kotlin Getters & Setters Explained (OOP - Easy Words)
 * ============================================================
 *
 * In Object-Oriented Programming (OOP), every object has data
 * (called properties or fields) and ways to read/write that data.
 *
 * - Getter  → the way to READ a value  (like asking "what is it?")
 * - Setter  → the way to WRITE a value (like saying "change it to...")
 *
 * In Java you often write methods like:
 *   getName() and setName(value)
 *
 * In Kotlin it is much cleaner. Kotlin uses properties.
 * Behind the scenes Kotlin still creates get() and set(),
 * but you usually don't write them yourself.
 *
 * This file shows both the simple way and the custom way.
 */

// ============================================================
// 1. The SIMPLE way (most common in Kotlin)
// ============================================================

class PersonSimple {
    // This is a property.
    // Kotlin automatically creates:
    //   - a private field to store the value
    //   - a getter  (get())
    //   - a setter  (set())
    var name: String = "Unknown"

    // You can also make it read-only with 'val'
    // Then only a getter is created (no setter)
    val id: Int = 101
}

// How to use it:
fun demoSimple() {
    val person = PersonSimple()

    // This looks like direct access, but Kotlin calls the getter
    println(person.name)          // calls get()

    // This looks like assignment, but Kotlin calls the setter
    person.name = "Ali"           // calls set("Ali")

    println(person.name)          // "Ali"
    // person.id = 200            // ERROR - val has no setter
}


// ============================================================
// 2. Custom Getter and Setter (when you need extra logic)
// ============================================================

class PersonCustom {

    // Private backing field - the real place where data is stored
    private var _name: String = "Unknown"

    // Public property with custom get() and set()
    var name: String
        // Custom getter - runs every time someone reads the property
        get() {
            println("Someone is reading the name...")
            return _name.uppercase()   // always return uppercase
        }

        // Custom setter - runs every time someone writes the property
        set(value) {
            println("Someone is changing the name...")
            // You can add validation or cleaning here
            if (value.isBlank()) {
                println("Name cannot be empty. Keeping old value.")
            } else {
                _name = value.trim()   // remove extra spaces
            }
        }
}

// How to use it:
fun demoCustom() {
    val person = PersonCustom()

    person.name = "  sara  "      // calls set("  sara  ")
    // Output: Someone is changing the name...

    println(person.name)          // calls get()
    // Output: Someone is reading the name...
    //         SARA
}


// ============================================================
// 3. Even simpler custom getter (no private field needed)
// ============================================================

class Temperature {
    var celsius: Double = 0.0

    // This property has only a getter (no setter)
    // It calculates the value every time it is read
    val fahrenheit: Double
        get() = celsius * 9 / 5 + 32
}

fun demoTemperature() {
    val temp = Temperature()
    temp.celsius = 25.0

    println(temp.fahrenheit)      // 77.0  (calculated on the fly)
}


// ============================================================
// 4. Full real-world example with validation
// ============================================================

class BankAccount(startingBalance: Double) {

    // Private field - only this class can touch it directly
    private var _balance: Double = startingBalance

    // Public property with safety rules
    var balance: Double
        get() = _balance                    // just return the value

        set(value) {
            if (value < 0) {
                println("Error: Balance cannot be negative!")
            } else {
                _balance = value
                println("Balance updated to $_balance")
            }
        }

    // A read-only property that uses the getter of balance
    val isEmpty: Boolean
        get() = balance == 0.0
}

fun demoBank() {
    val account = BankAccount(1000.0)

    println(account.balance)      // 1000.0

    account.balance = 1500.0      // Balance updated to 1500.0
    account.balance = -50.0       // Error: Balance cannot be negative!

    println(account.isEmpty)      // false
}


// ============================================================
// 5. Summary in very easy words
// ============================================================
/*
 * 1. In Kotlin you mostly write:
 *       var name: String = "Ali"
 *    Kotlin creates get() and set() for you automatically.
 *
 * 2. When you need special rules (validation, formatting, logging),
 *    you write your own:
 *
 *       var name: String
 *           get() { ... return something }
 *           set(value) { ... do something with value }
 *
 * 3. 'val' = only getter (read-only)
 *    'var' = getter + setter (read and write)
 *
 * 4. The real data is often kept in a private field
 *    (example: private var _name)
 *    and the public property controls how people access it.
 *
 * This is one of the cleanest ways OOP handles data access.
 */


// ============================================================
// Run the demos
// ============================================================
fun main() {
    println("=== Simple Property ===")
    demoSimple()

    println("\n=== Custom Getter & Setter ===")
    demoCustom()

    println("\n=== Calculated Property ===")
    demoTemperature()

    println("\n=== Bank Account Example ===")
    demoBank()
}
