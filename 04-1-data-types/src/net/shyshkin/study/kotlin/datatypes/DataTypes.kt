package net.shyshkin.study.kotlin.datatypes

import net.shyshkin.study.kotlin.javacode.DummyClass

fun dataTypes() {

    println("--- Data Types ---")

    val myInt = 10 //Int - default data type
    println("myInt is Int: ${myInt is Int}")

    var myLong: Long = 10
    val myLong2 = 10L //Long - compiler figures out type Long by L

    //myLong = myInt; //ERROR - no widening type like in Java
    myLong = myInt.toLong()

    val myByte: Byte = 111
    val myShort: Short
    myShort = myByte.toShort()

    var myDouble = 1.0
    println("myDouble is Double: ${myDouble is Double}")

    val myFloat = 1.0f //Float
    println("myFloat is Float: ${myFloat is Float}")

    myDouble = myFloat.toDouble() //no automatic widening

    val myChar = 'b'
    val myChar2: Char = 65.toChar()

    println("Char variable is $myChar2")

    val myBoolean = true

    val dummyJavaClass = DummyClass()
    println(dummyJavaClass.isVacationTime(myBoolean))   // Java boolean
    println(dummyJavaClass.isVacationTimeB(myBoolean))  // Java Boolean

    var anything: Any

}
