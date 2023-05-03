package l04_objects

//Reverse the digits in an integer number using String conversion.

fun reverseDecimal(number: Int): String = number.toString().reversed()


fun main() {
    println(reverseDecimal(987654321)) //123456789
}