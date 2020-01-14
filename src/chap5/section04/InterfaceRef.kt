package chap5.section04

open class A {
    open fun f() = println("A class f()")
    fun a() = println("A class a()")
}

interface B {
    // interface 는 기본적으로 open 함수임
    fun f() = println("B interface f()")
    fun b() = println("B interface b()")
}

class C : A(), B {
    override fun f() = println("C class f()")
    fun test() {
        f()
        b()
        // 제네릭으로 부모클래스/인터페이스를 구분 할 수 있음
        super<A>.f()
        super<B>.f()
    }
}
fun main() {
    val c = C()
    c.test()
}