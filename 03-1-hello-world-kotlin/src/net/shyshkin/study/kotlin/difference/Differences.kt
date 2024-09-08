package net.shyshkin.study.kotlin.difference

import net.shyshkin.study.kotlin.Employee

fun differences() {

    // access to the elements of ArrayList by index is preferred, not `get()` method
    val names = arrayListOf("Art", "Kate", "Arina", "Nazar")
    println(names[1])

    println(names.get(1))

    //String class is NOT the Java String class. It has some different methods

    //keyword `throws` is absent, no need to declare methods with exceptions.
    //Kotlin does not distinguish checked and unchecked exceptions

    //ternary operation - DOES NOT EXIST
    // q = x ? y : z

    //FOR loop
    //for(int i=0;i<10;i++){} - DOES NOT EXIST

    // does not contain STATIC keyword

    // no `new` keyword
    val employee1 = Employee("Art", 123)

}