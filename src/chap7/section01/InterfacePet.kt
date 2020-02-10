package chap7.section01

interface Pet {
    var category: String // 기본적으로 추상 프로퍼티
    val msgTags: String
    get() = "I'm your lovely pet"

    fun feeding()        // 마찬가지로 추상 메소드

    // 구현부를 포함하는 순간, 일반 메소드
    fun patting() {
        println("Keep Patting")
    }
}

class Cat(override var category: String) : Pet {
    override fun feeding() {
        println("Feed the vat a tuna can !")
    }
}

fun main() {
    val obj = Cat("Small")
    println("Pet Category : ${obj.category}")
    println("Pet Message Tag : ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}