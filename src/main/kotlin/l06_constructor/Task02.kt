package l06_constructor
class Robot {
         var x: Int = 0
         var y: Int = 0
         val fieldsize: Int = 0
}

fun main() {
    val robbie = Robot()
    println("""
        ${robbie.x}
        ${robbie.y}
        ${robbie.fieldsize}
    """.trimIndent())
}