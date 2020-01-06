package chap3.section02

import com.eample.edu.Person

/**
 * [Functional Programming - Basic]
 *
 * 1. 함수형 프로그래밍의 정의
 *     - 아래 세가지를 이용하는 프로그래밍을 지칭함.
 *     1) 순수함수
 *     2) 람다식
 *     3) 고차함수
 *
 * 2. 순수함수
 *     - 인자로 받은 값들을 변형하지 않고,
 *     - 항상 같은 결과값을 반환하는 함수
 *
 * 3. 람다식
 *     - 이름이 명시되지 않은 일급함수
 *     1) 다른함수의 인자로 사용할 수 있는 함수
 *     2) 다른함수의 반환값으로 사용 될 수 있는 함수
 *     3) 다른 변수에 담길 수 있는 함수
 *
 * 4. 고차함수
 *     - 함수의 매개변수 또는 반환값에 '순수함수' 또는 '람다식'을 포함한 함수
 *
 */
fun main() {
    val sum = highFunc({x, y -> x + y}, 1, 5)
    println("result = $sum")
}

fun highFunc(sumLambda: (Int, Int) -> Int, num1: Int, num2: Int): Int = sumLambda(num1, num2)

// 모든상황을 순수함수화 할수는 없겠지만, 최대한 노력은 해볼 것.
fun notPureFunc() {
    val person = Person(12345, "Ted") // 이와같이 외부로부터 전달받은 인자가 아닌 내부 생성변수는 되도록 피할 것.
    if(person != null) process(person) // notPureFunc() 함수의 일관된 결과를 유추하기 어려운 다음의 구조는 피할 것.
}

fun process(person: Person) {
    // do something
}