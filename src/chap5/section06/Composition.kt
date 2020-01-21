package chap5.section06

fun main() {
    val car1 = Car("K5", "180hp")
    car1.startEngine()
    car1.endEngine()
}

class Car(val name: String, val power: String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun endEngine() = engine.end()
}

class Engine(power: String) {
    fun start() = println("engine has been started.")
    fun end() = println("engine has been ended")
}