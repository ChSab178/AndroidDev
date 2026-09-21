```kotlin
/*
===========================================================
KOTLIN CLASS INHERITANCE
===========================================================

Inheritance means:

    One class can get/use the properties and functions
    of another class.

The class being inherited from = PARENT / SUPERCLASS
The class that inherits = CHILD / SUBCLASS

Think of it like:

    Samosa
       ↑
       |
  MeethaSamosa

MeethaSamosa IS-A Samosa.

So a MeethaSamosa object can use things from Samosa.

-----------------------------------------------------------
IMPORTANT:
-----------------------------------------------------------

In Kotlin, classes are FINAL by default.

That means this does NOT work:

    class Samosa { }

    class MeethaSamosa : Samosa() { }

Kotlin will give an error because Samosa is not allowed
to be inherited.

To allow inheritance, use:

    open class Samosa { }

===========================================================
*/


// ---------------------------------------------------------
// 1. OPEN CLASS
// ---------------------------------------------------------

/*
"open" means:

    Other classes are allowed to inherit from this class.

Without "open", a class cannot normally be inherited.
*/

open class Samosa {

    var price: Int = 40

    fun display() {
        println("Price is $price")
    }
}


// ---------------------------------------------------------
// 2. CHILD CLASS
// ---------------------------------------------------------

/*
MeethaSamosa inherits Samosa.

    Samosa       -> Parent
    MeethaSamosa -> Child

The : means inheritance.

    class MeethaSamosa : Samosa()

It means:

    MeethaSamosa extends/inherits Samosa
*/

class MeethaSamosa : Samosa() {

    var y: Int = 50

    fun displayY() {
        println("Y is $y")
    }
}


// ---------------------------------------------------------
// 3. USING THE CHILD OBJECT
// ---------------------------------------------------------

fun basicExample() {

    val meethaSamosa = MeethaSamosa()

    // display() belongs to the parent Samosa class.
    // But the child can use it because it inherited it.
    meethaSamosa.display()

    // displayY() belongs to MeethaSamosa itself.
    meethaSamosa.displayY()
}


/*
Output:

Price is 40
Y is 50
*/


// =========================================================
// PARENT AND CHILD CLASS
// =========================================================

/*

Think of inheritance like this:

                Samosa
              /        \
             /          \
        MeethaSamosa   AlooSamosa


Samosa is the PARENT.

MeethaSamosa and AlooSamosa are CHILDREN.

Both children can use things from Samosa.

*/


open class Food {

    var name = "Food"

    fun eat() {
        println("Eating $name")
    }
}


class Samosa : Food() {

    fun makeSamosa() {
        println("Making samosa")
    }
}


class Biryani : Food() {

    fun makeBiryani() {
        println("Making biryani")
    }
}


fun parentChildExample() {

    val samosa = Samosa()

    // From Food
    samosa.eat()

    // From Samosa
    samosa.makeSamosa()


    val biryani = Biryani()

    // From Food
    biryani.eat()

    // From Biryani
    biryani.makeBiryani()
}


// =========================================================
// WHAT DOES THE CHILD ACTUALLY GET?
// =========================================================

/*

If we have:

open class Samosa {

    var price = 40

    fun display() {
        println(price)
    }
}

class MeethaSamosa : Samosa() {

    var sweetness = 10
}

Then MeethaSamosa has access to:

    price
    display()
    sweetness

So:

    val samosa = MeethaSamosa()

    samosa.price
    samosa.display()
    samosa.sweetness

are all possible.
*/


// =========================================================
// 4. PARENT CONSTRUCTOR + CHILD CLASS
// =========================================================

/*

Now an important situation.

What if the parent class has a constructor?

Example:

open class Samosa(val price: Int)

The parent requires a price.

When creating the child class, we must provide that
value to the parent constructor.

*/

open class SamosaWithPrice(val price: Int) {

    fun displayPrice() {
        println("Price: $price")
    }
}


class MeethaSamosaWithPrice(price: Int) : SamosaWithPrice(price) {

    var sweetness = 100

    fun displaySweetness() {
        println("Sweetness: $sweetness")
    }
}


fun constructorInheritanceExample() {

    /*
    The child constructor receives price.

    Then:

        SamosaWithPrice(price)

    sends that value to the parent constructor.
    */

    val samosa = MeethaSamosaWithPrice(80)

    samosa.displayPrice()
    samosa.displaySweetness()
}


/*
Output:

Price: 80
Sweetness: 100
*/


// =========================================================
// 5. CHILD CAN HAVE ITS OWN CONSTRUCTOR
// =========================================================

open class Person(val name: String) {

    fun introduce() {
        println("My name is $name")
    }
}


class Student(
    name: String,
    val age: Int
) : Person(name) {

    fun showAge() {
        println("Age: $age")
    }
}


fun studentExample() {

    val student = Student("Hammad", 18)

    // From parent
    student.introduce()

    // From child
    student.showAge()
}


/*

Student has:

    name  -> comes from Person
    age   -> belongs to Student

When we write:

    Student("Hammad", 18)

The values go like this:

    "Hammad"
        |
        v
    Person(name)

    18
        |
        v
    Student.age


===========================================================
*/


// =========================================================
// 6. SECONDARY CONSTRUCTOR + INHERITANCE
// =========================================================

/*

A child class can also have a secondary constructor.

*/

open class Animal(val name: String) {

    fun showName() {
        println("Animal: $name")
    }
}


class Dog : Animal {

    val age: Int

    // Secondary constructor
    constructor(name: String, age: Int) : super(name) {

        this.age = age
    }

    fun showAge() {
        println("Age: $age")
    }
}


fun secondaryConstructorExample() {

    val dog = Dog("Tommy", 3)

    dog.showName()
    dog.showAge()
}


/*

super(name)

means:

    "Send name to the parent constructor."

So:

    Dog("Tommy", 3)

becomes roughly:

    Animal("Tommy")
    +
    Dog age = 3


===========================================================
*/


// =========================================================
// 7. OVERRIDING A FUNCTION
// =========================================================

/*

Sometimes we don't just want to inherit a function.

We want the child to provide its OWN version.

For that:

    Parent function -> open
    Child function  -> override

Example:
*/

open class AnimalSound {

    open fun sound() {
        println("Animal makes a sound")
    }
}


class DogSound : AnimalSound() {

    override fun sound() {
        println("Dog says Woof")
    }
}


class CatSound : AnimalSound() {

    override fun sound() {
        println("Cat says Meow")
    }
}


fun overridingExample() {

    val dog = DogSound()
    dog.sound()

    val cat = CatSound()
    cat.sound()
}


/*

Output:

Dog says Woof
Cat says Meow


Why "open" again?

Because functions are also final by default.

This:

    fun sound()

cannot normally be overridden.

So we write:

    open fun sound()

to allow children to replace its implementation.


===========================================================
*/


// =========================================================
// 8. OVERRIDING PROPERTIES
// =========================================================

/*

Properties can also be overridden.

*/

open class Vehicle {

    open val wheels: Int = 4
}


class Bike : Vehicle() {

    override val wheels: Int = 2
}


fun propertyOverrideExample() {

    val bike = Bike()

    println(bike.wheels)
}


/*
Output:

2
*/


// =========================================================
// 9. USING "super"
// =========================================================

/*

"super" means:

    Go to the parent class.

Example:
*/

open class Parent {

    open fun hello() {
        println("Hello from Parent")
    }
}


class Child : Parent() {

    override fun hello() {

        // Run parent's version first
        super.hello()

        // Then run child's version
        println("Hello from Child")
    }
}


fun superExample() {

    val child = Child()

    child.hello()
}


/*
Output:

Hello from Parent
Hello from Child


So:

    super.hello()

means:

    "Call the parent's hello()."


===========================================================
*/


// =========================================================
// 10. MULTIPLE INHERITANCE
// =========================================================

/*

Kotlin does NOT allow a class to inherit from
multiple classes.

This is NOT allowed:

    class A
    class B

    class C : A(), B()   // ERROR


Why?

Because it can create confusion.

Suppose:

    class A {
        fun hello() {
            println("A")
        }
    }

    class B {
        fun hello() {
            println("B")
        }
    }

    class C : A(), B()

Now:

    C().hello()

Which hello() should Kotlin call?

A's?

or

B's?

This is one reason Kotlin does not support
multiple class inheritance.
*/


// =========================================================
// 11. MULTIPLE INTERFACES
// =========================================================

/*

Although Kotlin doesn't allow multiple CLASS inheritance,

a class CAN implement multiple INTERFACES.

Example:
*/

interface Flyable {

    fun fly()
}


interface Swimmable {

    fun swim()
}


class Duck : Flyable, Swimmable {

    override fun fly() {
        println("Duck is flying")
    }

    override fun swim() {
        println("Duck is swimming")
    }
}


fun multipleInterfaceExample() {

    val duck = Duck()

    duck.fly()
    duck.swim()
}


/*

This is allowed:

    class Duck : Flyable, Swimmable

Because Flyable and Swimmable are interfaces.

So Kotlin's common approach is:

    ONE parent class
        +
    MULTIPLE interfaces


For example:

    class Duck : Animal(), Flyable, Swimmable

This is allowed because:

    Animal       = class
    Flyable      = interface
    Swimmable    = interface


===========================================================
*/


// =========================================================
// 12. MULTIPLE INTERFACES WITH SAME FUNCTION
// =========================================================

/*

What if two interfaces have the same function?

Kotlin makes us resolve the conflict.

*/

interface A {

    fun hello() {
        println("Hello from A")
    }
}


interface B {

    fun hello() {
        println("Hello from B")
    }
}


class C : A, B {

    override fun hello() {

        println("Hello from C")

        // We can specifically call A's version:
        super<A>.hello()

        // Or B's version:
        super<B>.hello()
    }
}


/*

The important syntax is:

    super<A>.hello()

or:

    super<B>.hello()

This tells Kotlin exactly which interface's function
we want.


===========================================================
*/


// =========================================================
// 13. OPEN CLASS vs NORMAL CLASS
// =========================================================

/*

NORMAL CLASS:

    class A

Means:

    "Do not inherit from me."

OPEN CLASS:

    open class A

Means:

    "You are allowed to inherit from me."


Same idea for functions:

    fun hello()

Cannot normally be overridden.

    open fun hello()

Can be overridden.


Example:
*/

class NormalClass {

    fun hello() {
        println("Hello")
    }
}


/*

This would NOT be allowed:

    class Child : NormalClass()

because NormalClass is final.
*/


open class OpenClass {

    open fun hello() {
        println("Hello")
    }
}


class ChildClass : OpenClass() {

    override fun hello() {
        println("Hello from Child")
    }
}


// =========================================================
// 14. FINAL
// =========================================================

/*

"final" means:

    Do not allow further inheritance/overriding.

Kotlin classes and functions are final by default.

You can also explicitly write final:

    final class A

or:

    final fun hello()


For example:
*/

open class ParentClass {

    final fun cannotOverride() {
        println("This cannot be overridden")
    }
}


/*

A child can use cannotOverride():

    child.cannotOverride()

But it cannot replace its implementation.


===========================================================
*/


// =========================================================
// 15. COMPLETE MENTAL MODEL
// =========================================================

/*

Remember inheritance like this:

                    PARENT
                      |
                      |
                open class
                      |
              ----------------
              |              |
              v              v
           CHILD 1        CHILD 2
              |              |
              |              |
           own things      own things


Example:

open class Animal {

    fun eat() {}
}

class Dog : Animal() {

    fun bark() {}
}


Dog gets:

    eat()  <- from Animal

and has:

    bark() <- its own


So:

    Dog IS-A Animal


===========================================================
*/


// =========================================================
// 16. YOUR ORIGINAL EXAMPLE
// =========================================================

/*

Your original code:

*/

open class SamosaFinalExample {

    var price: Int = 40

    fun display() {
        println("Price is $price")
    }
}


class MeethaSamosaFinalExample : SamosaFinalExample() {

    var y = 50

    fun displayY() {
        println("Y is $y")
    }
}


fun main() {

    val meethaSamosa = MeethaSamosaFinalExample()

    // Inherited from SamosaFinalExample
    meethaSamosa.display()

    // Belongs to MeethaSamosaFinalExample
    meethaSamosa.displayY()
}


/*
Output:

Price is 40
Y is 50


The important part is:

    open class SamosaFinalExample

            ↓

    class MeethaSamosaFinalExample : SamosaFinalExample()

            ↓

    val meethaSamosa = MeethaSamosaFinalExample()


The object is a MeethaSamosaFinalExample.

Because it is a child of SamosaFinalExample,
it can use the parent's accessible members.


===========================================================
QUICK CHEAT SHEET
===========================================================

class A
    -> normal/final class
    -> cannot be inherited

open class A
    -> can be inherited

class B : A()
    -> B inherits A

open fun hello()
    -> child is allowed to override hello()

override fun hello()
    -> child provides its own version

super.hello()
    -> call parent's version

super(value)
    -> call parent constructor

class C : A(), B
    -> NOT allowed if A and B are classes

class C : InterfaceA, InterfaceB
    -> allowed

class C : Parent(), InterfaceA, InterfaceB
    -> allowed


===========================================================
MOST IMPORTANT THINGS TO REMEMBER
===========================================================

1. Kotlin classes are final by default.

2. Use "open" on a class if it can be inherited.

3. Use ":" to inherit a class.

4. The inherited class is called the parent/superclass.

5. The inheriting class is called the child/subclass.

6. A child can use the parent's accessible properties
   and functions.

7. If the parent has a constructor, the child must
   initialize the parent through the inheritance syntax.

8. Use "open" on a parent function if children should
   be able to override it.

9. Use "override" in the child to replace the parent's
   function/property implementation.

10. Use "super" to access the parent implementation.

11. Kotlin does not support inheriting from multiple
    classes.

12. Kotlin DOES support implementing multiple interfaces.

13. A class can have:

        ONE parent class
        +
        MULTIPLE interfaces

===========================================================
*/
```
