package net.shyshkin.study.kotlin

import net.shyshkin.study.kotlin.bitwise.bitOperations
import net.shyshkin.study.kotlin.casting.casting
import net.shyshkin.study.kotlin.challenge1.challenge1
import net.shyshkin.study.kotlin.declarations.declarations
import net.shyshkin.study.kotlin.difference.differences
import net.shyshkin.study.kotlin.equality.compareEquality
import net.shyshkin.study.kotlin.raw_strings.rawStrings
import net.shyshkin.study.kotlin.stringtemplate.stringTemplate

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello, World!")

    declarations()

    differences()

    compareEquality()

    bitOperations()

    casting()

    stringTemplate()

    rawStrings()

    challenge1()

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return other.id == id && other.name == name
        }
        return false
    }

    override fun toString(): String {
        //String template
        return "Employee(name=$name, id=$id)"
    }
}