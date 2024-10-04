package net.shyshkin.study.external_module_package

import net.shyshkin.study.kotlin.imports.another.topLevelFunction

fun main(args: Array<String>) {
    topLevelFunction("Call from another module")
}