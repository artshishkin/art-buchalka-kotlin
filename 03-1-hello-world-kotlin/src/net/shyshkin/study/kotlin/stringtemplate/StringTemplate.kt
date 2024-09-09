package net.shyshkin.study.kotlin.stringtemplate

import net.shyshkin.study.kotlin.Employee

fun stringTemplate(){

    val change = 5.43

    println("--- String Template ---")

    println("To show the value of change, we use \$change")
    println("It has value $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    val employee = Employee("Nazar", 8)
    println("Fields of an object must be enclosed into the expression: i.e. employee has id = ${employee.id}")

}