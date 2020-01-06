package chap3.section03

/**
 * [Lambda Func]
 * 람다식은 변수, 함수의 매개변수 및 반환값 등에 사용 될 수 있다.
 */
fun main() {
    // 1. 인자에 일반 함수 사용
//    example01()

    // 2. 반환값에 일반 함수 사용
//    println("example02 : ${example02()}")

    // 3. 변수에 함수 적용
//    example03()

    // 4. 매개변수 및 반환값이 없는 람다식
    example04()
}

fun sum(x: Int, y: Int): Int = x + y
fun mul(x: Int, y: Int): Int = x * y

fun example01() {
    val res1 = sum(2, 3)
    val res2 = mul(3, 4)
    println("res1 : $res1 / res2 : $res2")
}

fun example02(): Int {
    return 2 * 2;
}

fun example03() {
    var result: Int
    val multi = { x: Int, y: Int ->
        println("x = $x, y = $y")
        x * y
    }

    result = multi(10, 20)
    println("result : $result")
}

fun example04() {
    val noParam: () -> Unit = {println("no params, no results")}
    val square: (Int) -> Int = {x -> x * x}

    noParam()
    println("${noParam()}")
    println("Square : ${square(2)}")
}

