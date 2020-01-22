package chap6.section01

/**
 * [프로퍼티 오버라이딩]
 * 기본적으로 프로퍼티는 overriding 할 수 없지만, open 키워드를 사용하면 가능하다.
 */
fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}

open class First {
    val y = 10
    open val x: Int = 0
    get() {
        println("First x")
        return field
    }
}

class Second: First() {
    override val x: Int = 0
        get() {
            println("Second x")
            return field + 3
        }
}

