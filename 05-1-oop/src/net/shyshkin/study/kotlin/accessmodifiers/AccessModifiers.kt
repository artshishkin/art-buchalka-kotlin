package net.shyshkin.study.kotlin.accessmodifiers

fun accessModifiers() {

    println("--- AccessModifiers ---")

    val emp = EmployeePrivate()
    println(emp)
}

// visible to everything in this file
private class EmployeePrivate {

}

internal class EmployeeInternal { //visible inside the module

}

class EmployeeDefault {

}

public class EmployeePublic {

}


