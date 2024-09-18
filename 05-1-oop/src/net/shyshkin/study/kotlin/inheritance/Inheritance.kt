package net.shyshkin.study.kotlin.inheritance

fun inheritance(){

    println("--- Inheritance ---")

    val laserPrinter = LaserPrinter("Canon LBP2900")
    laserPrinter.printModel()

    println("Printer type: ${laserPrinter.type()}, best price: ${laserPrinter.bestSellingPrice()}")

    val hp = NotMatchingConstructorLaserPrinter("HP", "super laser", 15)
    println("NotMatchingConstructorLaserPrinter type: ${hp.type()}, ppm: ${hp.ppm}")

    val defaultLaserPrinter = DefaultLaserPrinter()
    println("Default laser printer: ${defaultLaserPrinter.modelName}")

    val my3DColor1 = My3DColor("green", "deep0.1")
    println(my3DColor1)
    val my3DColor2 = My3DColor("blue")
    println(my3DColor2)

}