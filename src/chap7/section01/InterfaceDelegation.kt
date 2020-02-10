package chap7.section01

interface A {
    fun functionA()
}

interface B {
    fun functionB()
}

class C(val a: A, val b: B) : A by a, B by b{
    fun functionC() {
        functionA()
        functionB()
    }
}
