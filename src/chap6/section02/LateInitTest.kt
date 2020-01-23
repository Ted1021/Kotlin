package chap6.section02

/**
 * [LateInit]
 * var 로 선언된 프로퍼티만 사용가능
 * lateinit 으로 선언된 프로퍼티에 대해서 커스텀 getter/setter 를 지정 핧 수 없음
 */
class Person {
    lateinit var name: String

    fun test() {
        if (::name.isInitialized) {
            println("Initialized")
        } else {
            println("is not initialized")
        }
    }
}

// 클래스 또한 lateinit 이 가능하다.
lateinit var person2: Person

fun main() {
    val person = Person()
    person.test()

    person.name = "TED"
    person.test()

    person2 = Person()
    person2.test()
}