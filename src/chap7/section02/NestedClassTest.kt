package chap7.section02

/**
 * Kotlin 에서 내부클래스는 기본적으로 static 클래스 인것으로 간주한다.
 * 따라서, 객체 생성없이 내부 메소드나 프로퍼티를 호출 할 수 있다.
 *
 * 중첩된 클래스는 바로 바깥의 클래스 내의 프로퍼티에 접근 할 수 없는데,
 * 이는 접근하려는 메소드와 프로퍼티가 static 이 아니기 때문이다. (JAVA 와 동일)
 * 따라서, Nested Class 에서 사용하고자 하는 요소는 모두 companion object 와 같이
 * static 처리를 해주어야만 접근 가능하다.
 */
class Outer {
    val on = 5
    companion object {
        val accessParam = "companion param"
    }

    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv"
        fun accessOuterClass() = "[Nested] access = $accessParam"
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

    println(Outer.Nested().accessOuterClass())
}