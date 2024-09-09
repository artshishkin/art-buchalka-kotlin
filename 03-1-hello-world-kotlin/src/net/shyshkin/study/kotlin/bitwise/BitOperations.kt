package net.shyshkin.study.kotlin.bitwise

fun bitOperations() {

    val a = 0b01010101
    val b = 0b11001100

    val r1 = a or b //in Java r1 = a | b
    val r2 = a and b //in Java r2 = a & b
    val r3 = a xor b //in Java r3 = a ^ b
    val r4 = a.inv() // ~a
    val r5 = a shl 2 // a << 2
    val r6 = a shr 2 // a >> 2
    val r7 = a ushr 2 // a >>> 2 unsigned shift right

    println("--- bitwise operators ---")
    println(r1)
    println(r2)
    println(r3)
    println(r4)
    println(r5)
    println(r6)
    println(r7)

}