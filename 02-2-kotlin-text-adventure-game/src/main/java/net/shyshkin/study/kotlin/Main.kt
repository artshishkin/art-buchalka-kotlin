package net.shyshkin.study.kotlin;

fun main(args: Array<String>) {

    val locations = readLocationInfo()

    var loc = 64;

    while (true) {

        val location = locations[loc] ?: Location(0, "Sorry, something went wrong, so the game will terminate")

        println(location.description)

        if (loc == 0) {
            break
        }

        val exits = location.exits;
        print("Available exits are ");

        exits.keys.forEach {
            print("$it, ")
        }

        println()

        val direction = readLine()?.uppercase() ?: "Z";

        if (exits.containsKey(direction)) {
            loc = exits[direction]!!
        } else {
            println("You cannot go in that direction");
        }

    }

}

