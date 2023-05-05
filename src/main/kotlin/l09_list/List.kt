package l09_list

fun main() {
    val fruitsList = listOf("Orange", "Apple", "Apricot", "Pear", "Avocado")

    println(fruitsList.subList(1, 3)) // Apple, Apricot

    // попробуем заменить кл элемент

    // fruitsList[2] = "Cherry" // List в нашем случае неизменяемый

    val vegetableList = mutableListOf("Potato")

    vegetableList.add("Tomato")

    println(vegetableList) // [Potato, Tomato]
    vegetableList.add(0, "Onion")
    vegetableList.add(1, "Cucumber")

    vegetableList.addAll(listOf("Radish", "Turnip","Garlik", "Carrot"))

    println(vegetableList)

}

