package net.shyshkin.study.kotlin.challenge2

fun main(args: Array<String>) {
    challenge2()
}

fun challenge2() {

    println("--- CHALLENGE 2 ---")

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384

    val floatVar1 = -3847.384f
    val floatVar2: Float
    floatVar2 = -3847.384f

    // 2. Now change both of those variable declarations into nullable variables.
    val floatVarNullable1: Float? = -3847.384f
    val floatVarNullable2: Float?
    floatVarNullable2 = -3847.384f

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shortsArray1: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val shortsArray2: Array<Short> = Array(5) { i -> i.toShort() }
    val shortsArray3 = shortArrayOf(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val nullableInts: Array<Int?> = Array(40) { i -> (i + 1) * 5 }
    println(nullableInts[nullableInts.size - 1])

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val charArray: CharArray = charArrayOf('a', 'b', 'c')

    val javaChallenge2 = JavaChallenge2()
    javaChallenge2.method1(charArray)

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val y = x?.lowercase() ?: "I give up!"
    println(y)

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let { println(it.lowercase().replace("am", "am not")) }

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}