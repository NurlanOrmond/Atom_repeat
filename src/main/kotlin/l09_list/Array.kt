package l09_list

fun main() {
    val fruitsArray = arrayOf("Orange", "Apple", "Apricot", "Pear") // массив строк
    // arrayOf() - Returns an array containing the specified elements.

    val element = fruitsArray[1] // Apple
    fruitsArray[1] = "Peach"  // Peach заменили

    fruitsArray.set(3, "Banana")

    for (s in fruitsArray) {
        println(s)
    }

    // fruitsArray. после точки досрупны все функции

}