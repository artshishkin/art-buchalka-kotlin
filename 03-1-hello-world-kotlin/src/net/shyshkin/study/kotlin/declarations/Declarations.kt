package net.shyshkin.study.kotlin.declarations

import net.shyshkin.study.kotlin.Employee
import net.shyshkin.study.kotlin.EmployeeSet

fun declarations() {
    //val
    val numberInferenceType = 25
    val numberWithType: Int

    numberWithType = 3
    //numberWithType=5 // NOT ALLOWED

    val numberWithBoth: Short = 23

    //var
    var numberReAssigned: Int

    numberReAssigned = 3
    numberReAssigned = 5

    val employee1 = Employee("Art", 123)

    //var - mutable variable
    employee1.name = "Kate"

    //val - immutable
    //employee1.id = 100
    //or
    //employee1 = Employee("Arina", 321)

    val employee2: Employee
    val number = 100

    //val could be assigned only once
    if (number < 100) {
        employee2 = Employee("Nazar", 234)
    } else {
        employee2 = Employee("Tanya", 333)
    }

    val employeeSet: EmployeeSet = HashSet()
    println(employeeSet)

}

