package net.shyshkin.study.kotlin.functions

class Utils {

    // The Java way approach
    fun upperFirstAndLast(str: String): String {

        val chars = str.toCharArray()

        chars.forEachIndexed {idx, ch ->
            if (idx == 0 || idx == chars.size - 1) {
                chars[idx] = ch.uppercaseChar()
            }
        }
        return chars.concatToString()
    }

}