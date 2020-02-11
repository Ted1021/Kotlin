package chap7.section02

/**
 * Kotlin 에서 내부클래스는 기본적으로 static 클래스 인것으로 간주한다.
 * 따라서, 객체 생성없이 내부 메소드나 프로퍼티를 호출 할 수 있다.
 */
class Outer {
    val on = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv"
    }

    fun outside() {
        val msg = Nested().greeting() // 클래스 내부에서 접근 가능
        println("[Outer] $msg, ${Nested().nv}")
    }
}

fun main() {
    // static 처럼 객체생성 없이 사용
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    outer.outside()
    // Outer.outside() // 일반 클래스의 경우, 객체 생성 후 접근 가능
}