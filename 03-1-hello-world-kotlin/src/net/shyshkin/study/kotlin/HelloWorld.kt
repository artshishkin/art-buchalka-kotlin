package net.shyshkin.study.kotlin

import net.shyshkin.study.kotlin.declarations.declarations
import net.shyshkin.study.kotlin.difference.differences

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello, World!")

    declarations()

    differences()

}

class Employee(var name: String, val id: Int)