package net.shyshkin.study.kotlin.nullreferences

fun main(args: Array<String>) {
    var str: String? = "This is not a NULL" // ? - means that this variable is of nullable type
    if (str != null) { //similar to smart-casting
        str.lowercase()
    }

    str?.lowercase() //safe access expression - safe CALL operator

    val str2: String? = null // ? - means that this variable is of nullable type

    println(str2?.lowercase())
    println("str2?.lowercase() = ${str2?.lowercase()}")

    println("str2?.lowercase()?.reversed()?.plus(\"<<<\") = ${str2?.lowercase()?.reversed()?.plus("<<<")}")

    // ?: - elvis operator
    println("Providing default value = ${str2?.lowercase()?.reversed()?.plus("<<<") ?: "this is the default value"}")

    val something: Any = arrayOf(1,2,3,4)
    val str3 = something as? String //safe `CAST` operator
    println(str3)
    println(str3?.uppercase())

}