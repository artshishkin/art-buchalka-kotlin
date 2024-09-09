package net.shyshkin.study.kotlin.casting

import net.shyshkin.study.kotlin.Employee

fun casting() {

    println("-- Casting and type checking")

    val obj: Any = Employee("Art", 123)

    if (obj is Employee) {

        val newEmployee = obj as Employee //casting is not needed

        println(newEmployee.name + " is Employee")

    }

    if (obj is Employee) {
        //smart casting
        println(obj.name + " is Employee")
    }


    //inversion of type checking
    if (obj !is String) {

        println("$obj is not String")

    }

}