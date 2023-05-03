package creating_classes

fun dogSound() = "Gav-Gav"
class Dog {
    fun bark() = "yip!"
    fun sound() = bark()
}

fun main() {
    val dog = Dog()
    println(dog.sound())

}