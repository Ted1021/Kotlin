package chap7.section01

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    var year = "2018"

    abstract var maxSpeed: Double
    abstract fun start()
    abstract fun stop()

    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, MaxSpeed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double
) : Vehicle(name, color, weight) {
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }
}

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double
) : Vehicle(name, color, weight) {
    override fun start() {
        println("cycle start")
    }

    override fun stop() {
        println("cycle stopped")
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1100.0, 270.0)
    val motor = Motorcycle("bungbung", "red", 110.0, 300.0)

    car.year = "2013"
    car.displaySpecs()
    car.start()

    motor.displaySpecs()
    motor.start()
}