/*
========================================================
        KOTLIN VISIBILITY MODIFIERS
========================================================

Kotlin has 4 main visibility modifiers:

    1. public
    2. private
    3. internal
    4. protected

They control:

    "Who is allowed to access this class, function,
     property, or other piece of code?"

Think of them like access levels.

    public    -> Almost everyone can access it
    private   -> Only a specific area can access it
    internal  -> Only the same project/module can access it
    protected -> The class itself + its child classes
========================================================
*/


// ======================================================
// 1. PUBLIC
// ======================================================

/*
public means:

    "This can be accessed from anywhere where the
     containing code is accessible."

In Kotlin, public is the DEFAULT visibility.

So these two are basically the same:

    public fun hello() {}
    fun hello() {}

*/

public class PublicExample {

    public val name = "Hammad"

    public fun sayHello() {
        println("Hello from PublicExample")
    }
}


fun publicExample() {

    val obj = PublicExample()

    // public property -> accessible
    println(obj.name)

    // public function -> accessible
    obj.sayHello()
}


/*
WHEN TO USE public?

Use public when something is intentionally part of
your class/module's usable interface.

For example, an Android class might expose:

    fun login()
    fun logout()
    fun getUser()

Other parts of your application can call them.
*/


// ======================================================
// 2. PRIVATE
// ======================================================

/*
private means:

    "Only the specific place where this is declared
     can access it."

For a top-level function/property:

    private -> only this FILE can access it.

For a class member:

    private -> only the SAME CLASS can access it.
*/

private fun privateFunction() {
    println("This function is private")
}


// This works because we are in the SAME FILE.
fun usePrivateFunction() {
    privateFunction()
}


class BankAccount {

    private var balance = 0


    fun deposit(amount: Int) {
        balance += amount
    }


    fun showBalance() {
        println("Balance: $balance")
    }
}


fun privateClassExample() {

    val account = BankAccount()

    account.deposit(100)
    account.showBalance()

    /*
    This would NOT work:

        account.balance

    Why?

    Because balance is private.

    Only BankAccount itself can directly access balance.
    */
}


/*
WHY IS private USEFUL?

Imagine you have:

    balance
    password
    internal calculation
    database connection
    helper function

You may NOT want other code changing or using them
directly.

private protects them from outside code.

Example:

    class BankAccount {

        private var balance = 0

        fun deposit(amount: Int) {
            balance += amount
        }
    }

Other code cannot simply do:

    account.balance = -100000

Instead, it must go through the functions you provide.
*/


// ======================================================
// 3. INTERNAL
// ======================================================

/*
internal means:

    "Accessible inside the same MODULE."

A module is basically a separately compiled part of
your application/project.

For example, in a normal Android project, your application
module can contain many Kotlin files.

If something is internal, code inside that module can
use it.

Code from another module cannot directly use it.
*/

internal class InternalExample {

    internal val message = "Hello from internal"

    internal fun showMessage() {
        println(message)
    }
}


fun internalExample() {

    val obj = InternalExample()

    obj.showMessage()
    println(obj.message)
}


/*
IMPORTANT:

internal is NOT the same as private.

private:

    Usually restricts access to the file/class.

internal:

    Allows access across the same module.

Think:

    private  -> "Keep this close."
    internal -> "My whole module can use this."
    public   -> "Other modules can use this too."
*/


/*
WHEN IS internal USEFUL?

Suppose you are building an Android application.

You have:

    app module
        |
        +-- Login.kt
        +-- UserRepository.kt
        +-- Database.kt
        +-- Helpers.kt

Maybe you want some helper code to be available
throughout your app module, but you don't want it
to become part of the public API of another module.

You can use:

    internal
*/


// ======================================================
// 4. PROTECTED
// ======================================================

/*
protected is mainly used with classes.

It means:

    "The class itself and its child/subclasses can
     access this."

A child class is a class that inherits from another class.
*/


open class Animal {

    protected val name = "Animal"

    protected fun makeSound() {
        println("Some animal sound")
    }
}


class Dog : Animal() {

    fun showAnimalInfo() {

        // protected property -> accessible
        println(name)

        // protected function -> accessible
        makeSound()
    }
}


fun protectedExample() {

    val dog = Dog()

    dog.showAnimalInfo()

    /*
    These would NOT work:

        dog.name
        dog.makeSound()

    Why?

    Because they are protected.

    They are available to Animal and its child classes,
    but not directly to unrelated outside code.
    */
}


/*
IMPORTANT DIFFERENCE:

private:

    Only the class itself can access the member.

protected:

    The class itself + its child classes can access it.
*/


// ======================================================
// COMPARISON
// ======================================================

/*

                    WHERE CAN IT BE ACCESSED?
----------------------------------------------------------

public
    -> Anywhere the code is visible

private
    -> Top-level: same file
    -> Class member: same class

internal
    -> Anywhere inside the same module

protected
    -> Same class + child/subclasses


A simple way to remember:

    public
        "Everyone"

    private
        "Only me"

    internal
        "My module"

    protected
        "Me + my children"


----------------------------------------------------------
*/


// ======================================================
// SIMPLE EXAMPLE OF ALL 4
// ======================================================

open class User {

    // Anyone can access this
    public val username = "hammad"


    // Only User can access this
    private val password = "12345"


    // Code in the same module can access this
    internal val userId = 101


    // User + child classes can access this
    protected val email = "user@example.com"


    fun showUser() {

        println(username)
        println(password)
        println(userId)
        println(email)
    }
}


class Admin : User() {

    fun showAdminData() {

        // public -> YES
        println(username)

        // private -> NO
        // println(password)

        // internal -> YES (if in same module)
        println(userId)

        // protected -> YES
        println(email)
    }
}


// ======================================================
// TOP-LEVEL VISIBILITY
// ======================================================

/*
Visibility modifiers can also be used outside classes.

Example:

    public fun hello()
    private fun secret()
    internal fun helper()

But protected CANNOT normally be used for top-level
functions or properties.

protected is designed for class inheritance.
*/


public fun publicFunction() {
    println("Public function")
}


private fun privateFunction2() {
    println("Private function")
}


internal fun internalFunction() {
    println("Internal function")
}


// protected fun something()
// -> NOT allowed at top level



// ======================================================
// DEFAULT VISIBILITY
// ======================================================

/*
If you don't write a visibility modifier, Kotlin
usually uses public.

Example:

    class User {}

    fun login() {}

    val name = "Hammad"


These are public by default.

So:

    class User {}

is basically:

    public class User {}

And:

    fun login() {}

is basically:

    public fun login() {}
*/


// ======================================================
// WHY VISIBILITY MODIFIERS MATTER
// ======================================================

/*
They help you control which parts of your code
other code is allowed to use.

Imagine a class like this:

    class BankAccount {

        private var balance = 0

        fun deposit(amount: Int) {
            balance += amount
        }

        fun getBalance(): Int {
            return balance
        }
    }


Instead of allowing everyone to directly modify:

    balance

you control how it changes:

    deposit()
    getBalance()


This makes your code easier to control and maintain.

This idea becomes VERY useful in Android development,
especially when building:

    - Classes
    - ViewModels
    - Repositories
    - Services
    - Data classes
    - APIs
*/


// ======================================================
// QUICK CHEAT SHEET
// ======================================================

/*

Modifier       Simple Meaning

public         Anyone can access it

private        Keep it limited to the current
               file/class

internal       Available inside the same module

protected      Available to the class and its
               child classes


Remember:

    public    = OPEN
    private   = RESTRICTED
    internal  = MODULE
    protected = INHERITANCE


Most commonly:

    private  -> hide implementation/details

    public   -> expose something others should use

    internal -> share between parts of your module

    protected -> share with child classes
*/


fun main() {

    println("=== Visibility Modifiers ===")

    publicExample()

    privateClassExample()

    internalExample()

    protectedExample()

    val admin = Admin()
    admin.showAdminData()
}
