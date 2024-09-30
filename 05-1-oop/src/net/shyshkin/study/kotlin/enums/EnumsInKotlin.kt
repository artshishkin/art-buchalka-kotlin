package net.shyshkin.study.kotlin.enums

fun main(args: Array<String>) {

    println(DepartmentSimple.HR)
    println(DepartmentEnhanced.IT)
    println(DepartmentEnhanced.SALES.getDepartmentInfo())

}

enum class DepartmentSimple{
    HR, IT, ACCOUNTING, SALES
}

enum class DepartmentEnhanced(private val fullName: String, private val numEmployees: Int) {
    HR("Human Resource", 100),
    IT("IT", 300),
    ACCOUNTING("ACC", 10),
    SALES("Sales", 200);

    fun getDepartmentInfo() = "The $fullName departament has $numEmployees employees"

    override fun toString(): String {
        return "DepartmentEnhanced(fullName='$fullName', numEmployees=$numEmployees)"
    }
}