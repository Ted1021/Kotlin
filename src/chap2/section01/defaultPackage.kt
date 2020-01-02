package chap2.section01

fun main() {
    // 상수는 val, 변수는 var 로 표현한다.
    // 자료형은 :{자료형} 으로 명시 할 수 있다.
    val intro: String = "HI!"
    val num: Int = 10

    // $value 를 통해 변수를 formatting 할 수 있다.
    println("Intro : $intro \nnum : $num")
}