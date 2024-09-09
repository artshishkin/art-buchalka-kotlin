package net.shyshkin.study.kotlin.equality

import net.shyshkin.study.kotlin.Employee

fun compareEquality() {

    val employee1 = Employee("Art", 1);
    val employee2 = Employee("Kate", 2);
    val employee3 = Employee("Kate", 2);

    val employee4 = employee2

    // Java
    // Referential equality
    //System.out.println(employee1 == employee2); //false
    //System.out.println(employee2 == employee3); //false
    // Structural equality
    //System.out.println(employee1.equals(employee2)); //false
    //System.out.println(employee2.equals(employee3)); //true

    //Kotlin
    // Structural equality
    println(employee1 == employee2); //false
    println(employee2 == employee3); //TRUE - IT IS THE SAME AS employee2.equals(employee3)
    println(employee1.equals(employee2)); //false
    println(employee2.equals(employee3)); //true
    // Referential equality
    println(employee1 === employee2); //false
    println(employee2 === employee3); //false
    println(employee2 === employee4); //true

    println(employee2 != employee4); //false
    println(employee2 !== employee4); //false
    println(employee2 != employee3); //false
    println(employee2 !== employee3); //true


}