package l03_creating_classes

class Cat {
    fun meow() = "mrrrow!"
}

fun main() {
    val cat = Cat()
    // Call 'meow()' for 'cat':
    val m1 = cat.meow()
    println(m1)
}
/* Output:
mrrrow!
*/