package net.shyshkin.study.kotlin.functions

import net.shyshkin.study.kotlin.data.Car
import java.util.*

fun functionBasics(): Unit { //Unit - returns NOTHING - like void in Java

    println("--- Function Basics ---")

    println(labelMultiplyWithBlockBody(3, 6, "The result is:"))
    println(labelMultiplySimplified(3, 6, "The result of simplified is:"))
    println(labelMultiplySimplified(3, 6))

    println(labelMultiplySimplified(label = "Reordering operands by using `named arguments`", operand2 = 3, operand1 = 6))

    functionWithoutReturn()

    val art = Employee("Art")
    println(art.upperCaseFirstName())

    val r = Random()
    val colors = arrayOf("black", "green", "red", "white", "blue", "green")
    val models = arrayOf("Ford", "Mazda", "Toyota", "BMW", "Mercedes", "Renault")
    val carsArray = Array<Car>(10) { i ->
        Car(
                color = colors[r.nextInt(colors.size)],
                model = models[r.nextInt(models.size)],
                year = 2010 + i
        )
    }

    printColorsOfVariableNumberOfCars(*carsArray, prefix = "color_with_spread: ") //using Spread operator - The * operator is used to unpack the array so that each element is passed as a separate argument to the function.
    printColorsOfVariableNumberOfCars(carsArray[0], carsArray[1], carsArray[2], prefix = "color_for_3: ")

    printColorsOfVariableNumberOfCarsVarargInTheEd("for vararg in the end you can omit named arguments -> ", carsArray[0], carsArray[1], carsArray[2])

    //spread operator
    val moreCars = arrayOf(carsArray[0].copy(year = 2023), carsArray[1].copy(year = 2024))
    val carSeparate = carsArray[2].copy(year = 2022, model = carsArray[2].model.uppercase().plus("_new"))
    val allTheCars: Array<Car> = arrayOf(*carsArray, *moreCars, carSeparate)
    allTheCars.forEach { println(it) }

}

//function with block-body
fun labelMultiplyWithBlockBody(operand1: Int,
                               operand2: Int,
                               label: String): String {
    return "$label ${operand1 * operand2}"
}

//function with expression-body
fun labelMultiplySimplified(operand1: Int,
                            operand2: Int,
                            label: String = "The answer is:") = "$label ${operand1 * operand2}"

fun functionWithoutReturn(): Unit = println("function without return")

//fun whatever():Unit = 3 * 4 //Wrong - Required: Unit, but Found: Int
fun whatever() = 3 * 4

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.uppercase()
}

fun printColorsOfVariableNumberOfCars(vararg cars: Car, prefix: String) {
    cars.forEach { println("$prefix${it.color}") }
}

fun printColorsOfVariableNumberOfCarsVarargInTheEd(prefix: String, vararg cars: Car) {
    cars.forEach { println("$prefix${it.color}") }
}
