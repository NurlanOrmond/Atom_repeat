package l09_list

fun countOccurences (list: List<Int>, n: Int): Int {
    var count = 0
    for (i in list) {
       if (i == n) count ++
    }
    return count
}

fun main() {
    val list = listOf(1, 1, 2, 3, 4, 8, 6, 7, 5, 5)
    println(countOccurences(list, 7))
}