package chap6.section04

class Hobby(val name: String)

// Object 선언
object OCustomer {
    var name = "TED"
    val HOBBY = Hobby("BasketBall")

    fun greeting() {
        println("[OCustomer] Hello World!")
    }

    init {
        println("OCustomer init!")
    }
}

class CCustomer {
    companion object {
        const val HELLO = "hello"
        var name = "ALICE"
        @JvmField val HOBBY = Hobby("Football")
        @JvmStatic fun greeting() { println("[CCustomer] Hello World!")}
    }

    init {
        println("CCustomer init!")
    }
}

fun main() {
    OCustomer.greeting() // greeting 을 호출한 순간 인스턴스화 됨
    OCustomer.name = "TED_AFTER"
    println("name = ${OCustomer.HOBBY.name}")

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}