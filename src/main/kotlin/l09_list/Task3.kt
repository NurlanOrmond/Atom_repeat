package l09_list

import java.util.*

/*
    Write a function to determine whether two Strings are anagrams. An anagram is a word formed
    by rearranging the letters of a different word, using all the original letters exactly once.
 */

fun checkAnagrams(s1: String, s2: String): Boolean =
    s1.toList().sorted() == s2.toList().sorted()


fun main() {
    println(checkAnagrams("thing", "night"))
    checkAnagrams("leader", "dealer")
    checkAnagrams("sector", "escort")
    checkAnagrams("tablet", "battle")
    checkAnagrams("friend", "finder")
    checkAnagrams("senator", "treason")
    checkAnagrams("terrain", "trainer")
    checkAnagrams("teaching", "cheating")

    checkAnagrams("pots", "stops")
    checkAnagrams("escort", "sectors")
    checkAnagrams("sections", "notices")
}