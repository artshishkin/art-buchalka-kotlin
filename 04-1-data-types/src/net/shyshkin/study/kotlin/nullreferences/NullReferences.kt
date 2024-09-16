package net.shyshkin.study.kotlin.nullreferences

fun main(args: Array<String>) {

    escapingNulls()

    arrayOfNullsFun()

    println("end")

}

fun escapingNulls() {

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

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String //safe `CAST` operator
    println(str3)
    println(str3?.uppercase())

    val str4 = str!!.uppercase() // Not-null assertion operator - in case you are sure `str` is NOT null or you want NPE exception

    println(str4)

    val strNull: String? = null

    try {
        val str5 = strNull!!  // WILL THROW NPE
        val str6 = str5.uppercase()
        println(str6)
    } catch (ex: NullPointerException) {
        ex.printStackTrace()
    }

    try {
        printText(str!!)
        printText(strNull!!) // WILL THROW NPE
    } catch (ex: NullPointerException) {
        ex.printStackTrace()
    }

    str?.let { printText(it) } // `let` function is called when str is not null
    strNull?.let { printText(it) } // `let` function is called when strNull is not null

    println(strNull == str)

}

fun printText(text: String) {
    println(text)
}

fun arrayOfNullsFun() {

    println("arrayOfNullsFun")

    val nullableInts: Array<Int?> = arrayOfNulls<Int>(5) //if you want to create of objects but do not want to initialize it

    nullableInts[1] = 123

    nullableInts.forEach { println(it) }

    println("even if null then you can call toString(): nullableInts[3].toString() = ${nullableInts[3].toString()}")


}