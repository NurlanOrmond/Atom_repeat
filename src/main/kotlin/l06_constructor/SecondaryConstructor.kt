package l06_constructor

class Person12 (val name: String, val lastname: String, val age: Int) {

    var city: String = ""

    constructor(
        name: String,
        lastname: String,
        age: Int,
        city: String
    ): this(name, lastname, age) {
        this.city = city
    }
}

fun main() {
    val boy = Person12("Bart", "Simpson", 10)

    //boy.city // Unresolved reference: city

    val girl = Person12 ("Nikole", "Kidman", 50, "Sydney")

    println(girl.city)
}