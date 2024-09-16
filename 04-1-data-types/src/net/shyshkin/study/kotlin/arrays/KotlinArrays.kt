package net.shyshkin.study.kotlin.arrays

import net.shyshkin.study.kotlin.javacode.DummyClass
import java.math.BigDecimal

fun arrays() {

    println("--- Arrays in Kotlin ---")

    val names = arrayOf("Art", "Kate", "Arina", "Nazar")

    val longs1 = arrayOf(1L, 2L, 3)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val ints1 = arrayOf(1, 2, 3)

    println("longs1 is Array<Long>: ${longs1 is Array<Long>}")
    println("longs2 is Array<Long>: ${longs2 is Array<Long>}")
    println("ints1 is Array<Int>: ${ints1 is Array<Int>}")

    println("longs1[2] = ${longs1[2]}")
    try {
        println("longs1[10] = ${longs1[10]}") //java.lang.ArrayIndexOutOfBoundsException
    } catch (e: Exception) {
        e.printStackTrace()
    }

    val evenNumbers = Array(16) { i -> i * 2 }

    println("evenNumbers: $evenNumbers")
    evenNumbers.forEach { print("$it\t") }

    val lotsOfNumbers = Array(1_000_000) { i -> i + 1 }

    var allZeros = Array(100) { i -> 0 }
    allZeros = Array(100) { 0 } //simplified version

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(5) { i -> (i + 1) * 10 }

    someArray.forEach { println("new array: $it") }

    println("-- mixing data types in array --")

    val mixedArray = arrayOf('1', 2, 3L, 4.0, "five", BigDecimal(6.01))
    mixedArray.forEach { println("mixed: $it") }

    println(mixedArray.isArrayOf<Any>())

    val dummyClass = DummyClass()
    //dummyClass.printNumbers(ints1) //ERROR - Type mismatch IntArray vs Array<Int>

    val intArray = intArrayOf(1, 2, 3, 4)
    dummyClass.printNumbers(intArray)

    val intArray2 = IntArray(5) //primitive array initializes by default values
    intArray2.forEach { println("IntArray initialized: $it") }

    dummyClass.printNumbers(someArray.toIntArray())

    val convertedIntArray: Array<Int>  = intArray.toTypedArray()

}