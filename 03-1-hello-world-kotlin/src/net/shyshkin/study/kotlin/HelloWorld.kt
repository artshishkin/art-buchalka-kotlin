package net.shyshkin.study.kotlin

import net.shyshkin.study.kotlin.declarations.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello, World!")

    declarations()

}

class Employee(var name: String, val id: Int)