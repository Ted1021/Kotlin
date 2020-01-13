class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {
    val fName = println("[Property] Person fName: $firstName")

    init {
        println("[Init] Person init block")
    }

    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
        println("[Secondary Constructor] Body : $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Ted", 31)
    println()
    val p2 = Person("Alice")
}