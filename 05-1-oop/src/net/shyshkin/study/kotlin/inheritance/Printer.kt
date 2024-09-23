package net.shyshkin.study.kotlin.inheritance

import java.math.BigDecimal

// all in Kotlin is final and public by default
// so it needs to have `open` keyword
// **or**
// in case of abstract class - `abstract` keyword
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is `$modelName`")

    abstract fun type(): String

    abstract fun bestSellingPrice(): BigDecimal
}

open class LaserPrinter(modelName: String) : Printer(modelName), MyInterface {

    //we want that every subclass of a LaserPrinter uses THIS implementation of a function
    //so we disable this fun to be overriden by using `final` keyword
    final override fun printModel() = println("The model name of this Laser printer is `$modelName`")
    override fun type() = "laser"

    override fun bestSellingPrice() = BigDecimal("123.56")
    override val someProperty: Int = 123
    override val propertyWithDefaultValue: Int
        get() = 222

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }



}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName) {

    // NOT ALLOWED
    // override fun printModel() = println("Special Laser Printer: $modelName")

}

class NotMatchingConstructorLaserPrinter(modelName: String, private val type: String, val ppm: Int = 8) : LaserPrinter(modelName) {
    override fun type() = type
}

class DefaultLaserPrinter() : LaserPrinter("SomeDefaultPrinter") {
}

//class without primary constructor
open class Color {

    val colorName: String
    val deepness: String

    //secondary constructor 1
    constructor(colorName: String, deepness: String) {
        this.colorName = colorName
        this.deepness = deepness
        println("I'm in the parent's constructor")
    }

    //secondary constructor 2
    constructor(colorName: String) {
        this.colorName = colorName
        this.deepness = "too deep"
    }

    override fun toString(): String {
        return "Color(colorName='$colorName', deepness='$deepness')"
    }

}

// if there is a primary constructor then every constructor in the child should use parent primary constructor
class My3DColor : Color {

    //secondary constructor 1
    constructor(colorName: String, deepness: String) : super(colorName, deepness){
        println("I'm in the child's constructor")
    }

    //secondary constructor 2
    constructor(colorName: String) : super(colorName)

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

// DATA CLASS CAN NOT BE EXTENDED
//open data class SomeDataClass(val someNum:Int) //Modifier 'data' is incompatible with 'open'
//abstract data class SomeDataClass(val someNum:Int) //Modifier 'abstract' is incompatible with 'data'