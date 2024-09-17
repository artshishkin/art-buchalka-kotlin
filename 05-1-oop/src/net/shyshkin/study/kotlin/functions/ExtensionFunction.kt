package net.shyshkin.study.kotlin.functions

fun extensionFunctions() {

    println("-- EXTENSION FUNCTIONS --")
    println(Utils().upperFirstAndLast(""))
    println(Utils().upperFirstAndLast("m"))
    println(Utils().upperFirstAndLast("ma"))
    println(Utils().upperFirstAndLast("madam"))
    println(Utils().upperFirstAndLast("madam, i'm adam"))

    println("".upperFirstAndLast())
    println("m".upperFirstAndLast())
    println("ma".upperFirstAndLast())
    println("madam".upperFirstAndLast())
    println("madam, i'm adam".upperFirstAndLast())

    val s = "madam, i'm adam" //receiver object; String - is the receiver type
    println(s.upperFirstAndLast())

}

//the Kotlin way approach
fun String.upperFirstAndLast(): String {

    val chars = /*this. - we can omit*/toCharArray()

    chars.forEachIndexed {idx, ch ->
        if (idx == 0 || idx == chars.size - 1) {
            chars[idx] = ch.uppercaseChar()
        }
    }
    return chars.concatToString()
}