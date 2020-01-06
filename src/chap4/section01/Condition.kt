package chap4.section01

import chap3.section01.defaultParams
import com.eample.edu.Person

fun main() {
    // 1. 범위 조건 연산
//    grade()

    // 2. 인자가 없는 when
//    noParams()

    // 3. Any 응용
    typeCondition()
}

fun grade() {
    // when 과 in 을 조합하여 간단한 범위 조건문을 만들 수 있다.
    // 'in' 키워드는 이상, 이하 범주만 체크 가능하다.
    // 인자를 받는 when 은 디테일한 조건문을 작성 할 수 없다.
    print("score : ")
    val score: Double = readLine()?.toDoubleOrNull() ?: -1.0
    var grade: String = "F"

    when (score) {
        in 90.0..100.0 -> grade = "A"
        in 80.0..89.9 -> grade = "B"
        in 70.0..79.9 -> grade = "C"
        else -> "F"
    }

    println("grade : $grade")
}

fun noParams() {
    // 인자가 없는 when
    // when 의 조건문을 더 디테일하고 복잡하게 사용 할 수있다.
    // ex) 초과 미만 조건, String equalsIgnoreCase 등 ...
    print("score : " )
    val score: Double = readLine()?.toDoubleOrNull() ?: -1.0
    var grade = "F"
    when {
        score in 90.0..100.0 -> grade = "A"
        score < 70 -> grade = "F"
    }
}

fun typeCondition() {
    typeCase(1)
    typeCase(1234)
    typeCase("Hello")
    typeCase(Person(1, "ted"))
    typeCase("ASDASDASD")
}

fun typeCase(obj: Any) {
    when(obj) {
        is Int -> println("Integer : $obj")
        is Long -> println("Long : $obj")
        "Hello" -> println("String : $obj")
        is Person -> println("Person : id = ${obj.id} | name = ${obj.name}")
        else -> println("Nothing")
    }
}