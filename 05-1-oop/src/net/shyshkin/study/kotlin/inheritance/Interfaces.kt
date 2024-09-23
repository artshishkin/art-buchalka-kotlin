package net.shyshkin.study.kotlin.inheritance

interface MyInterface {

    val someProperty: Int
    val propertyWithDefaultValue: Int
        get() = someProperty * 100

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): String
}

class Something : MySubInterface {

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override val someProperty: Int = 25
    override val propertyWithDefaultValue: Int = 321

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}