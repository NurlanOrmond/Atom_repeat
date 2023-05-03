package l06_constructor

/*
    Create a class Floating that contains a val d of type Double.
    Initialize d in the constructor. Include a toString() member function that returns the contents of d.
    Write a main() to exercise the Floating class.
 */

class Floating(val d: Double) {
    override fun toString(): String {
        return "Floating(d=$d)"
    }
}

fun main() {
    val float = Floating(9.99)
    println(float)
}