package chap3.section03

fun main() {
    // 1. call by value
    val result = callByValue(lambda())
    println(result)

    println("============")

    // 2. call by name
    val result2 = callByName(lambda)
    println(result2)
}

val lambda: () -> Boolean = {
    println("lambdaFunction")
    true
}

fun callByValue(b: Boolean): Boolean {
    println("call by value")
    return b
}

fun callByName(b: () -> Boolean): Boolean {
    println("call by name")
    return b()
}