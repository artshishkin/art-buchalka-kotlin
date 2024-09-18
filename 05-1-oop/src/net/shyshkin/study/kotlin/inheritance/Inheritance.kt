package net.shyshkin.study.kotlin.inheritance

fun inheritance(){

    println("--- Inheritance ---")

    val laserPrinter = LaserPrinter("Canon LBP2900")
    laserPrinter.printModel()

    println("Printer type: ${laserPrinter.type()}, best price: ${laserPrinter.bestSellingPrice()}")

}