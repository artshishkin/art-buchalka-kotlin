package net.shyshkin.study.kotlin.inheritance

import java.math.BigDecimal

// all in Kotlin is final and public by default
// so it needs to have `open` keyword
// **or**
// in case of abstract class - `abstract` keyword
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is `$modelName`")

    abstract fun type():String

    abstract fun bestSellingPrice(): BigDecimal
}

class LaserPrinter(modelName: String) : Printer(modelName) {

    override fun printModel() = println("The model name of this Laser printer is `$modelName`")
    override fun type() = "laser"

    override fun bestSellingPrice() = BigDecimal("123.56")

}

//open class Printer(val modelName: String) {
//}
//class LaserPrinter : Printer() {
//
//}
// **OR**
//class LaserPrinter : Printer {
//    constructor(): super()
//}