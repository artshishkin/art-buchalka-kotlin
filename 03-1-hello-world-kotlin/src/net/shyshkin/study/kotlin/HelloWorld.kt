package net.shyshkin.study.kotlin

import net.shyshkin.study.kotlin.declarations.declarations
import net.shyshkin.study.kotlin.difference.differences
import net.shyshkin.study.kotlin.equality.compareEquality

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello, World!")

    declarations()

    differences()

    compareEquality()

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return other.id == id && other.name == name
        }
        return false
    }
}