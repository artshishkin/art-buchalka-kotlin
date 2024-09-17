package net.shyshkin.study.kotlin.data

fun dataClasses() {

    println("--- Data Classes ---")

    val car1 = Car("grey", "Ford", 2017)
    println(car1)
    println(car1.model)

    val car2 = Car("grey", "Ford", 2017)

    val car3 = car2.copy()

    println("car1.hashCode: ${car1.hashCode()}")
    println("car2.hashCode: ${car2.hashCode()}")
    println("car3.hashCode: ${car3.hashCode()}")

    println("car1==car2: ${car1 == car2}")
    println("car1==car3: ${car1 == car3}")

    println("car1===car2: ${car1 === car2}")
    println("car2===car3: ${car2 === car3}")

    val car4 = car2.copy(model = "Mazda", color = "blue")
    println(car4)
}