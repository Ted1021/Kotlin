package chap7.section03

/**
 * [Invoke Operator]
 * "operator fun invoke" 키워드를 사용하면,
 * 클래스명과 인자만으로 특정 기능을 수행 할 수 있다.
 * invoke 메소드의 overloading 또한 가능하다.
 */
class Manager {
    operator fun invoke(text: String) {
        println(text)
    }

    operator fun invoke(text: String, number: Int) {
        println("text=$text, num=$number")
    }
}

fun main() {
    val manager = Manager()
    manager("invoke operator test")
    manager("overloading test", 109)

    // 람다식은 기본적으로 invoke 가 적용된 operator 라고 볼 수 있다.
    val sum = {x: Int, y: Int -> x + y}
    println("result(invoke) : ${sum.invoke(3, 10)}")
    println("result : ${sum(3, 10)}")
}