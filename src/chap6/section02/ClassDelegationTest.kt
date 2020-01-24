package chap6.section02

interface Car {
    fun go(): String
}

class VanImpl(private val model: String, private val power: String): Car {
    override fun go() = "$model 은 짐을 적재하며 $power 를 가집니다."
}

class SportsImpl(private val model: String, private val power: String): Car {
    override fun go() = "$model 은 경주용이며, $power 를 가집니다."
}

class CarModel(impl: Car): Car by impl {
    fun carInfo() {
        println(go())
    }
}

fun main() {
    val myDamas = CarModel(VanImpl("Damas 2020", "100 마력"))
    val myK5 = CarModel(SportsImpl("K5 DL3 1.6T", "180 마력"))

    myDamas.carInfo()
    myK5.carInfo()
}