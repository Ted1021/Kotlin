package chap2.section03

import com.eample.edu.Person
import com.eample.edu.Pet

/**
 * [자료 형변환]
 * 1. 형변환
 *     - 코틀린에서는 타입이 서로 다르다면, 각 자료형의 형변환 함수를 사용해야한다.
 *     - 기존 자바에서 소괄호()를 이용한 명시적 형변환방식과 다르다.
 *
 * 2. Int 의 독특한 메모리구조
 *     - Int 의 경우, -128 ~ 127 범위의 숫자는 스택에 쌓지않고 캐싱한다. (문자열의 String Pool 과 유사)
 *     - 따라서, 위 범위 내의 값을 동일하게 가지는 서로 다른 변수들은 같은 주소값을 바라볼 수 있다.
 *
 * 3. 스마트 캐스트
 *     - 코틀린 내부에서 할당된 값을 적절한 자료형으로 자동 형변환을 지원한다.
 *     - 스마트 캐스트를 이용하는 방법은 아래의 두가지가 있다.
 *     1) Number
 *     2) Any
 */
fun main() {
    // 1. Number
    // 실수, 정수와 같이 숫자 형태를 자유롭게 형변환 할 수 있는 특수객체
    // number()

    // 2. Any
    // 코틀린 내 모든 클래스의 super 클래스
    // 어떤 형태로든 형 변환이 가능하며, 선언시나 is 키워드를 사용했을때에 스마트 캐스트를 통해 자료형이 정해진다.
    // any()

    // 3. 응용
    // 기본 자료형이 아닌 커스텀한 클래스에도 적용가능하다.
    val person = Person(1, "")
    val pet = Pet("merry", 5)
    classCast(person)
    classCast(pet)
}

fun number() {
    var test: Number = 12.2
    println("value : $test / type : ${test.javaClass}")

    test = 12
    println("value : $test / type : ${test.javaClass}")

    test = 120L
    println("value : $test / type : ${test.javaClass}")

    test += 12.2
    println("value : $test / type : ${test.javaClass}")
}

fun any() {
    var num: Any = 1
    println("value : $num / type : ${num.javaClass}")

    num = "Hello"
    println("value : $num / type : ${num.javaClass}")

    if (num is String) {
        println("value : $num / type : ${num.javaClass}")
    }
}

fun classCast(target: Any) {
    if (target is Person) {
        println("id : ${target.id} / name : ${target.name} / type : ${target.javaClass}")
    } else if (target is Pet) {
        println("age : ${target.age} / name : ${target.name} / type : ${target.javaClass}")
    }
}
