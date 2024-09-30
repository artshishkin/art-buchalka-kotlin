package net.shyshkin.study.kotlin.anonymous

fun main(args: Array<String>) {

    var thisIsMutable = 10


    val anonymousObj = object : SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * thisIsMutable}"
        }
    }

    wantsSomeInterface(anonymousObj)

    val anonymousObjWith2Interfaces = object : SomeInterface, SomeOtherInterface {

        override fun mustImplement(num: Int): String {
            TODO("Not yet implemented")
        }

        override fun otherMustImplement(num: Int): String {
            TODO("Not yet implemented")
        }

    }

    println(anonymousObjWith2Interfaces.mustImplement(123))
    println(anonymousObjWith2Interfaces.otherMustImplement(456))

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

interface SomeOtherInterface {
    fun otherMustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface: ${si.mustImplement(123)}")
}

