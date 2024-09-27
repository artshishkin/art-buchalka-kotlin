package net.shyshkin.study.kotlin.companion

fun main(args: Array<String>) {

    println("--- Companion ---")
    println(SomeClass.accessPrivateVar())
    println(SomeClass.Companion.accessPrivateVar())
    println(SomeClass2.accessPrivateVar())
    println(SomeClass2.SomeCompanion.accessPrivateVar())

    //Factory Pattern
//    SomeClass2("Private Constructor disables creating object directly")

    val justAssign = SomeClass2.justAssign("Art")
    println(justAssign)

    val upperOrLowerCase = SomeClass2.upperOrLowerCase("Kate", false)
    println(upperOrLowerCase)

}

class SomeClass {

    val someString: String

    constructor(str: String) {
        this.someString = str
    }

    constructor(str: String, lowerCase: Boolean) {
        this.someString = if (lowerCase) str.lowercase() else str.uppercase()
    }


    companion object {

        private val privateVar = 6

        fun accessPrivateVar() = "I am accessing private var: $privateVar"

    }

}

class SomeClass2 private constructor(val someString: String) {

    companion object SomeCompanion {

        private val privateVar = 7

        fun accessPrivateVar() = "I am accessing private var: $privateVar"

        fun justAssign(str: String): SomeClass2 = SomeClass2(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass2 = SomeClass2( if (lowerCase) str.lowercase() else str.uppercase())

    }

    override fun toString(): String {
        return "SomeClass2(someString='$someString')"
    }


}