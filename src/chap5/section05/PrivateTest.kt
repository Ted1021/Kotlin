package chap5.section05

/**
 * [캡슐화]
 *
 * 1. private   : 외부요소 접근 불가
 * 2. public    : 외부요소 접근 가능
 * 3. protected : 부모/자식간 접근 가능
 * 4. internal  : 같은 '모듈'내 접근 가능
 */
fun main() {
    val pc = PrivateClass()
    // pc.i 접근 불가
    pc.privateAccess() // privateFunc 접근 불가
}

private class PrivateClass {
    private var i = 1
    private fun privateFunc(): Int {
        return i + 1
    }

    fun privateAccess() {
        println("private var:${privateFunc()}")
    }
}

class OutterClass {
    private val opc = PrivateClass() // 프로퍼티로 private class 를 생성하고 싶다면, 선언도 private 으로 해 주어야 함.
    fun test() {
        val pc = PrivateClass()
        pc.privateAccess()
    }
}
