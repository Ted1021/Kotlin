package chap5.section05

fun main() {

}

open class Encapsulation {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e = 5
        private val f = 6
    }
}

class Derived2 : Encapsulation() {
    // a = 접근 불가
    // val a1 = super.a

    // 부모클래스의 접근제한자와 동일 (protected)
    override val b: Int
        get() = super.b

    // val c = Encapsulation().c

    fun access() {
        // 부모클래스의 public, internal, protected 프로퍼티/메소드 접근 가능
        val c = super.c
        val d = super.d
        val getNested = Nested().e
    }
}