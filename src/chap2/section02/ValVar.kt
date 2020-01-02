package chap2.section02

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber = 20

    // val(상수)형태로 선언되었기때문에 immutable
    // number = 30

    // var(변수) 형태로 선언되었기때문에 mutable
    language = "English"

    println("number : $number")
    println("language : $language")
    println("secondNumber : $secondNumber")
}