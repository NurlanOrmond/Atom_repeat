package l06_constructor

// Первичный конструктор:
//class Person11 (name: String, lastname: String, age: Int) {
//    val name:String = "Alice"
//    val lastName: String = "Smith"
//    val age: Int = 16
// }

class Person11 (name: String, lastname: String, age: Int) {
    val name:String = name
    val lastName: String = lastname
    val age: Int = age
 }


fun main() {
    val p1 = Person11("Zohan", "Adam", 28)
    println("""
        ${p1.name}
        ${p1.lastName}
        ${p1.age}
    """.trimIndent())
//Alice
//Smith
//16
    // Почему не распечаталось: "Zohan", "Adam", 28 ?
    // Потому что, нужно инициализировать поля класса

    //    val name:String = "Alice"
    //    val lastName: String = "Smith"
    //    val age: Int = 16

    //    полями из конструктора
    //    (name: String, lastname: String, age: Int)

    // в переменые поля записываются ссылки на созданные в памяти объекты со значениями




}