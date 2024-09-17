package net.shyshkin.study.kotlin.accessmodifiers_external

import net.shyshkin.study.kotlin.accessmodifiers.EmployeeDefault
import net.shyshkin.study.kotlin.accessmodifiers.EmployeeInternal
import net.shyshkin.study.kotlin.accessmodifiers.EmployeePublic

fun accessModifiersTest(){

    // val employeePrivate =  EmployeePrivate() - not visible from other file

    val employeeInternal = EmployeeInternal()

    val employeeDefault = EmployeeDefault() //sae as public

    val employeePublic = EmployeePublic()

}