package chap5.section04

open class Person {
    constructor(firstName: String) {
        println("[person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[person] firstName: $firstName, age: $age")
    }
}

class Developer: Person {
    constructor(firstName: String): this(firstName, 10) {
        println("[developer] $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) {
        println("[developer] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}