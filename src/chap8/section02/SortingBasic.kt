package chap8.section02

import java.util.*

val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

fun main() {
    sortingBasic()
}

fun sortingBasic() {
    val sortedNumbers = arr.sortedArray()
    println("ASC : ${sortedNumbers.contentToString()}")

    val sortedDescNumbers = arr.sortedArrayDescending()
    println("DES : ${sortedDescNumbers.contentToString()}")

    arr.sort(1,3)
    println("ORI : ${arr.contentToString()}")

    val items = arrayOf("Dog", "CAT", "LION", "KANGAROO", "PO")
    items.sortBy { it.length }
    println(items.contentToString())
}