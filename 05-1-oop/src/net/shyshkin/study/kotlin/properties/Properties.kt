package net.shyshkin.study.kotlin.properties

fun properties() {
    println("--- PROPERTIES ---")

    val art = EmployeeWithPrivateProperty("Art", false)

    println(art.firstName)
    // println(art.fullTime) // private field is not accessible

    val kate = Employee("Kate")
    kate.fullTime = false
    // kate.firstName = "Kateryna" // val is not modifiable
    println(kate)

    val arina = EmployeeWithCustomGetterAndSetter("Arina")
    arina.fullTime = false
    println(arina.firstName)
    println(arina.fullTime)

}

private class EmployeeWithPrivateProperty(val firstName: String, private var fullTime: Boolean = true) {

}

//For public properties you get getters and setters for free
private class Employee(val firstName: String, var fullTime: Boolean = true) {
    override fun toString(): String {
        return "Employee(firstName='$firstName', fullTime=$fullTime)"
    }
}

private class EmployeeWithCustomGetterAndSetter(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set")
            field = value
        }

    override fun toString(): String {
        return "Employee(firstName='$firstName', fullTime=$fullTime)"
    }
}

