package l04_objects

/*
    Palindromes are words or phrases that read the same forward and backward. For example:
"mom" is a palindrome
"dad" is a palindrome
"rotator" is a palindrome
"streets" is not a palindrome
Write a function that checks whether a word or phrase is a palindrome.
 */
fun palindrome(s: String) = s == s.reversed()

fun main() {
    println(
        palindrome("mom")
        )
    println(
        palindrome("Hello!")
    )
}