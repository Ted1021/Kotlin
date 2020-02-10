package chap7.section01

open class Animal(val name: String)

interface Pet {
    var category: String // 기본적으로 추상 프로퍼티
    var species: String

    val msgTags: String
        get() = "I'm your lovely pet"

    fun feeding()        // 마찬가지로 추상 메소드

    // 구현부를 포함하는 순간, 일반 메소드
    fun patting() {
        println("Keep Patting")
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species = "Cat"
    override fun feeding() {
        println("Feed the vat a tuna can!")
    }
}

class Dog(name: String, override var category: String) : Pet, Animal(name) {
    override var species = "Dog"
    override fun feeding() {
        println("Feed the dog bone :)")
    }
}

class Master {
   fun playWithPet(species: String) {
       println("Enjoy with $species")
   }
}

fun main() {
    val master = Master()
    val dog = Dog("Merry", "Small")
    val cat = Cat("Bori", "Small")

    master.playWithPet(dog.species)
    master.playWithPet(cat.species)
}
