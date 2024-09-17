package net.shyshkin.study.kotlin.classes

fun classes() {

    println("--- Classes ---")

    val art = EmployeeClassLongWay("Art")

    println(art.firstName)

    val kate = EmployeeClassMediumWay("Kate")

    println(kate.firstName)

    val arina = EmployeeClassShortWay("Arina")

    println(arina.firstName)

    val nazar = EmployeeClassShortestWay("Nazar")

    println(nazar.firstName)

    //val tanya = EmployeeClassProtectedConstructor("Tanya") can not access protected constructor

    println("-- secondary constructor --")
    val rita = EmployeeWithSecondaryConstructor("Rita", false)
    println(rita.fullTime)

    println("-- constructor with default value --")
    val rita2 = EmployeeWithDefaultPropertyValueWithoutSecondaryConstructor("Rita")
    println(rita2.firstName)
    println(rita2.fullTime)
    val rita3 = EmployeeWithDefaultPropertyValueWithoutSecondaryConstructor("Rita", false)
    println(rita3.firstName)
    println(rita3.fullTime)

    println("-- class without primary constructor ")
    println(Demo().dummy)
}

class EmployeeClassLongWay constructor(firstName: String) {

    val firstName: String

    init {
        this.firstName = firstName
    }
}

class EmployeeClassMediumWay constructor(firstName: String) {

    val firstName: String = firstName

}

class EmployeeClassShortWay constructor(val firstName: String) {

}

class EmployeeClassShortestWay(val firstName: String)

open class EmployeeClassProtectedConstructor protected constructor(val firstName: String) {

}

class EmployeeWithSecondaryConstructor(val firstName: String) {

    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }

}

class EmployeeWithDefaultPropertyValueWithoutSecondaryConstructor(val firstName: String, var fullTime: Boolean = true) {
}

class Demo {

    val dummy: String

    constructor() {
        this.dummy = "Hello"
    }
}
