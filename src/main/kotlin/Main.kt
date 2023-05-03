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

    println("""
        $si
        $sd
        $sb
        $sc
        $di
        $ci
        $cs
    """.trimIndent())




}