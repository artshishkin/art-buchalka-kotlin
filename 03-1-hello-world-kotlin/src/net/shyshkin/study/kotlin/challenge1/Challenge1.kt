package net.shyshkin.study.kotlin.challenge1

fun challenge1() {

    println("--- Challenge1 ---")

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var someNum = 2988

    val someAny: Any = "The Any type is the root of the Kotlin class hierarchy"

    if (someAny is String) {
        println(someAny.uppercase())
    }

    println("""
        |   1
        |  11
        | 111
        |1111
    """.trimMargin())

    println("""
        1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))

}