package l01_data_types

fun main(args: Array<String>) {
    val int: Int = 10
    val double: Double = 10.10
    val boolean: Boolean = false
    val string: String = "abcde"
    val character: Char = 'z'

    // Can be combined:

    val si = string + int
    val sd = string + double
    val sb = string + boolean
    val sc = string + character

    val di: Double = double + int
    val ci: Char = character + int
    val cs: String = character + string

    // Can't be combined:

//  val result9: Int = int + double
//  val result10: Int = int + boolean
//  val result11: Int = int + string
//  val result12: Int = int + character
//  val result13: Boolean = boolean + int
//  val result14: Boolean = boolean + string
//  val result15: Boolean = boolean + double
//  val result16: Boolean = boolean + character




}