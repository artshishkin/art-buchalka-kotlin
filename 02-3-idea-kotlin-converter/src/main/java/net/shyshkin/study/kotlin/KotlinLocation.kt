package net.shyshkin.study.kotlin

class Location(val locationID: Int, val description: String) {
    private val exits: MutableMap<String, Int>

    init {
        exits = HashMap()
        exits.put("Q", 0)
    }

    fun getExits(): Map<String, Int> {
        return HashMap(exits)
    }

    protected fun addExit(direction: String, location: Int) {
        exits.put(direction, location)
    }
}