package net.shyshkin.study.kotlin;

import java.io.File

fun readLocationInfo(): Map<Int, Location> {

    val locations = mutableMapOf<Int, Location>()

    File("02-2-kotlin-text-adventure-game/data/locations_big.txt").reader().forEachLine {
        val tokens = it.split("`")
        val locationID: Int = tokens[0].toInt()
        val description = tokens[1]
        val location = Location(locationID, description)

        locations[locationID] = location
    }

    File("02-2-kotlin-text-adventure-game/data/directions_big.txt").reader().forEachLine {
        val tokens = it.split(",")
        val initialLocationID: Int = tokens[0].toInt()
        val direction = tokens[1]
        val destinationLocationID: Int = tokens[2].toInt()

        locations[initialLocationID]?.addExit(direction, destinationLocationID)
    }

    return locations;
}
