package l09_list

import kotlin.random.Random


fun findMax(list: List<Int>): Int {
    var max = list[0]
    for (i in 1 until list.size) {
        if (list[i] > max) max = list[i]
    }
    return max
}

fun main() {
    val list = mutableListOf<Int>()
    for (i in 0.. 100) {
        list.add(Random.nextInt(500, 1000))
    }
    println(findMax(list))
}