package net.shyshkin.study.kotlin.imports

import net.shyshkin.study.kotlin.enums.DepartmentEnhanced.IT
import net.shyshkin.study.kotlin.imports.another.topLevelFunction
import net.shyshkin.study.kotlin.singleton.CompanyCommunications

fun main(args: Array<String>) {
    topLevelFunction("Hi from other")

    println(CompanyCommunications.getCopyrightLine())

    println(IT.getDepartmentInfo())

}