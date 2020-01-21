package chap5.section06

/**
 * [집합관계]
 */
fun main() {
    val pond = Pond("kimhae")
    val duck1 = Duck("TED")
    val duck2 = Duck("Alice")

    pond.members.add(duck1)
    pond.members.add(duck2)

    for(duck in pond.members) {
        println("name:${duck.name}")
    }
}

class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)
