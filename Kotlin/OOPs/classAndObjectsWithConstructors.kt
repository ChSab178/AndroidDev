/*
KOTLIN — CLASSES, OBJECTS & CONSTRUCTORS
=========================================

```
Topics:
1. Class
2. Object
3. Properties
4. Primary constructor
5. Default constructor values
6. init block
7. Member functions
8. Secondary constructors
9. Multiple constructors
10. this keyword
```

*/

fun main() {

```
// ============================================================
// 1. CREATING OBJECTS
// ============================================================

// A class is a blueprint.
// An object is an actual instance created from that class.

val student1 = Student("Hammad Asghar", 1, "Developer")

println(student1.name)
println(student1.id)
println(student1.about)

student1.sayHello()


// ============================================================
// 2. PRIMARY CONSTRUCTOR
// ============================================================

/*
    The constructor written next to the class name is called
    the PRIMARY CONSTRUCTOR.

    Here:

    Student(
        val name: String,
        val id: Int,
        val about: String
    )

    name, id and about become properties because we used val/var.
*/

val student2 = Student("Ammad Asghar", 2, "Student")

student2.detail()


// ============================================================
// 3. DEFAULT VALUES IN A PRIMARY CONSTRUCTOR
// ============================================================

/*
    You can give constructor parameters default values.

    This means we don't have to provide every argument.
*/

val student3 = Student()

student3.detail()

/*
    Because Student has:

    name = "Unknown"
    id = 0
    about = "Developer"

    Student() automatically uses those values.
*/


// ============================================================
// 4. INIT BLOCK
// ============================================================

/*
    init runs automatically when an object is created.

    Every time you create a new Student object,
    the init block runs once.
*/

val student4 = Student("Ali", 4, "Designer")

/*
    Output:

    Creating a Student object...
*/


// ============================================================
// 5. SECONDARY CONSTRUCTOR
// ============================================================

/*
    A constructor written inside the class body is called
    a SECONDARY CONSTRUCTOR.

    Example:

    constructor() { ... }

    constructor(model: String, color: String) { ... }
*/

val car1 = Car()

println(car1.carModel)
println(car1.carColor)


// Calling the SECONDARY constructor with arguments.

val car2 = Car("GWM", "Black")

println(car2.carModel)
println(car2.carColor)


// ============================================================
// 6. MULTIPLE CONSTRUCTORS
// ============================================================

/*
    A class can have multiple constructors.

    Car has:

        constructor()

    and

        constructor(model: String, color: String)

    Kotlin chooses the constructor based on the arguments
    you provide.
*/

val car3 = Car()
val car4 = Car("Toyota", "White")


// ============================================================
// 7. this KEYWORD
// ============================================================

/*
    'this' refers to the CURRENT OBJECT.

    In this constructor:

        constructor(model: String, color: String) {
            this.carModel = model
            this.carColor = color
        }

    'this.carModel' means:

        The carModel property belonging to THIS object.

    'model' means:

        The constructor parameter.

    So:

        this.carModel = model

    means:

        object's carModel = constructor's model
*/

println(car4.carModel)
println(car4.carColor)
```

}

// =================================================================
// STUDENT CLASS
// =================================================================

class Student(
var name: String = "Unknown",
var id: Int = 0,
var about: String = "Developer"
) {

```
/*
    This is the PRIMARY CONSTRUCTOR.

    Because we used var:

        name
        id
        about

    are automatically properties of the Student object.
*/


// ------------------------------------------------------------
// INIT BLOCK
// ------------------------------------------------------------

init {
    println("Creating a Student object...")
}

/*
    init runs automatically when Student() is called.

    For example:

        val student = Student()

    First the Student object is created,
    then the init block runs.
*/


// ------------------------------------------------------------
// MEMBER FUNCTION
// ------------------------------------------------------------

fun sayHello() {
    println("Hello, my name is $name and I'm a $about")
}


fun detail() {
    println("--------------------------------")
    println("ID: $id")
    println("Name: $name")
    println("About: $about")
    println("--------------------------------")
}
```

}

// =================================================================
// CAR CLASS — SECONDARY CONSTRUCTORS
// =================================================================

class Car {

```
// These are properties of the Car object.

var carModel: String = "Unknown"
var carColor: String = "Unknown"


// ------------------------------------------------------------
// SECONDARY CONSTRUCTOR — NO ARGUMENTS
// ------------------------------------------------------------

constructor() {
    println("Creating a car object...")
}


// ------------------------------------------------------------
// SECONDARY CONSTRUCTOR — WITH ARGUMENTS
// ------------------------------------------------------------

constructor(model: String, color: String) {

    /*
        We use 'this' because the constructor parameters
        have different names from the properties.

        this.carModel = the object's carModel
        model         = the constructor parameter
    */

    this.carModel = model
    this.carColor = color

    println("Car name is $carModel and color is $carColor")
}
```

}

/*
================================================================
QUICK SUMMARY
================================================================

```
CLASS
-----
Blueprint used to create objects.

    class Car {
    }


OBJECT
------
An instance of a class.

    val car = Car()


PRIMARY CONSTRUCTOR
-------------------
Constructor written beside the class name.

    class Student(
        var name: String,
        var id: Int
    )


DEFAULT VALUES
--------------
Constructor parameters can have default values.

    class Student(
        var name: String = "Unknown"
    )

    Student()


INIT
----
Runs automatically when an object is created.

    init {
        println("Object created")
    }


SECONDARY CONSTRUCTOR
---------------------
Constructor written inside the class body.

    constructor() {
    }

    constructor(name: String) {
    }


MULTIPLE CONSTRUCTORS
---------------------
A class can have multiple constructors as long as
their parameter lists are different.

    constructor()
    constructor(name: String)


this
----
Refers to the current object.

    this.carModel = model


MEMBER FUNCTION
---------------
A function defined inside a class.

    fun sayHello() {
        println("Hello")
    }
```

*/
