package net.shyshkin.study.kotlin.raw_strings

fun rawStrings() {

    println("--- Raw Strings ---")

    val windowsPath = """c:\Users\Admin\Downloads\somefile.apk"""

    println(windowsPath)

    val html = """
        <html lang="en">
            <h1>Triple-quoted strings</h1>
        <\html>
    """.trimIndent()

    println(html)

    val trimMargin = """
        *Humpty Dumpty sat on the wall
        *Humpty Dumpty had a great fall
        *All the king's horses and all the king's men
        *Couldn't put Humpty together again""".trimMargin("*")

    println(trimMargin)

    val eggName = "Humpty"

    val trimMarginDefault = """
        |$eggName Dumpty sat on the wall
        |$eggName Dumpty had a great fall
        |All the king's horses and all the king's men
        |Couldn't put $eggName together again""".trimMargin()

    println(trimMarginDefault)

}