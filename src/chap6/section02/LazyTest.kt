package chap6.section02

/**
 * [by lazy]
 * val 로 선언된 프로퍼티/객체에 대해 지연 초기화를 사용 할 수 있다.
 * 초기화될 값은 'by lazy' 를 통해 이미 정해져 있고, 설정된 프로퍼티나 객체를 접근하는시점에 초기화가 진행된다.
 */
class LazyTest {
    init {
        println("------ create class -------")
    }

    private val subject by lazy {
        println("------ subject initialized -------")
        "kotlin programming"
    }

    fun flow() {
        println("### flow ###")
        println("subject01:$subject") // 여기서 초기화 진행
        println("subject02:$subject") // 윗 줄에서 이미 초기화 된 값을 사용
    }
}

class Human(val name: String, val age: Int)

fun main() {
    val test = LazyTest()
    test.flow()

    var isHumanInstantiated: Boolean = false

    val human: Human by lazy {
        isHumanInstantiated = true
        Human("TED", 31)
    }

    val humanDelegation = lazy { Human("Alice", 29) }

    println("person init: $isHumanInstantiated")
    println("humanDelegation init: ${humanDelegation.isInitialized()}")

    println("human name: ${human.name}")
    println("humanDelegation: ${humanDelegation.value.name}")

    println("human is initialized: $isHumanInstantiated")
    println("humanDelegation init: ${humanDelegation.isInitialized()}")
}