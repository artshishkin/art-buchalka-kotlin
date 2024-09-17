package net.shyshkin.study.kotlin.accessmodifiers

fun accessModifiersTest(){

    // EmployeePrivate() - not visible from other file

    val employeeInternal = EmployeeInternal()

    val employeeDefault = EmployeeDefault() //same as public

    val employeePublic = EmployeePublic()

}