package chap3.section03

/**
 * [참조에 의한 호출]
 * 일반 함수의 경우, 람다식이 아니기 때문에
 * 바로 함수호출의 인자로 사용할 수는 없다.
 * 이때, '::' 심볼을 앞에두면 참조형태로 인자전달이 가능하다.
*/
fun main() {
    funcParams(1,2, ::addFunc)
}

val addLambda: (x: Int, y: Int) -> Int = { x, y -> x + y }
fun addFunc(x: Int, y: Int): Int = x + y

fun funcParams(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}