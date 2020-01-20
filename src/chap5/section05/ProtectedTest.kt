package chap5.section05

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class NestedClass
}

class Derived: Base() {
    fun test(base: Base): Int {
        protectedFunc() // 부모클래스 메소드 접근가능
        return i // 부모클래스 프로퍼티 접근 가능
    }
}

fun main() {
    val base = Base()
    // base.i // 프로퍼티 접근불가
    // base.protectedFunc // 메소드 접근 불가
    base.access()
}

