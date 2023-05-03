package l06_constructor
/*
Constructors
A class in Kotlin can have a primary constructor and one or more secondary constructors.
The primary constructor is a part of the class header, and it goes after the class name and optional type parameters.
 */

class Person3 constructor(firstName: String) { /*...*/ }

/*
If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
 */

class Person4(firstName: String) { /*...*/ }

/*
The primary constructor cannot contain any code.
Initialization code can be placed in initializer blocks prefixed with the init keyword.
During the initialization of an instance, the initializer blocks are executed in the same
order as they appear in the class body, interleaved (чередующийся) with the property initializers:
 */


class InitOrderDemo(name: String) {

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}
/*

Primary constructor parameters can be used in the initializer blocks.
They can also be used in property initializers declared in the class body:
 */

class Customer1(name: String) {
    val customerKey = name.uppercase()
}

// Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor:

class Person5 (val firstName: String, val lastName: String, var age: Int)

// Such declarations can also include default values of the class properties:

class Person6 (val firstName: String, val lastName: String, var isEmployed: Boolean = true)

// You can use a trailing comma when you declare class properties:

class Person7(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
)

/*
Much like regular properties, properties declared in the primary constructor can be mutable (var) or read-only (val).
If the constructor has annotations or visibility modifiers, the constructor keyword is required and the modifiers go before it:
*/

// class Customer2 public @Inject constructor(name: String) { /*...*/ }



// Secondary constructors

// A class can also declare secondary constructors, which are prefixed with constructor:
/*
class Person8(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}

If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done using the this keyword:

class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}
Code in initializer blocks effectively becomes part of the primary constructor. Delegation to the primary constructor happens at the moment of access to the first statement of a secondary constructor, so the code in all initializer blocks and property initializers is executed before the body of the secondary constructor.

Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed:

class Constructors {
    init {
        println("Init block")
    }
    ​
    constructor(i: Int) {
        println("Constructor $i")
    }
}
Open in Playground →
Target: JVM
Running on v.1.8.21
If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments. The visibility of the constructor will be public.

If you don't want your class to have a public constructor, declare an empty primary constructor with non-default visibility:

class DontCreateMe private constructor() { /*...*/ }
On the JVM, if all of the primary constructor parameters have default values, the compiler will generate an additional parameterless constructor which will use the default values. This makes it easier to use Kotlin with libraries such as Jackson or JPA that create class instances through parameterless constructors.

class Customer(val customerName: String = "")
*/