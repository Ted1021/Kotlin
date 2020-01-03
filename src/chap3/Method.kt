package chap3

/**
 * [Method]
 * 코틀린의 함수들은 기존 자바와 몇몇부분에서 차이가 있다.
 *
 * 1. 반환형
 *     - 자바에서 void 형은 실제로 리턴하는것이 없지만, 코틀린에서는 Unit 을 사용한다.
 *     - Unit 의 경우, 실제로 특정 값을 반환한다.
 *     - Unit 이 어떤 의미를 가지고, 왜 설계되었는지는 다음 챕터에서 확인
 *
 * 2. 매개변수 선언
 *     1) 매개변수에 default 값을 지정.
 *     2) 매개변수의 이름과 함께 함수 호출이 가능.
 *         - 특정 변수 값을 콕 집어 함수 호출 가능
 *     3) 가변인자 (Variable Argument)
 *         - 'vararg' symbol 을 이용하면 함수하나에 숫자가 가변적일 수 있는 매개변수 선언 가능.
 */
fun main() {
    // 1. method return
//    printSum(1,2)
//    println("result of getSum = ${getSum(2,3)}")

    // 2. default params
//    defaultParams("ted", null) // default 값이 지정된 매개변수에 null 삽입해보기
//    defaultParams("alice")

    // 3. named params
//    namedParam(name = "ted", part = "android")
//    namedParam(part = "ios", name = "alice")
//    namedParam("someone")

    // 4. variable arguments
    variableArgument(1)
    variableArgument(1,3,5)
    variableArgument(2,4,6,8,10)
    // variableArguments2(1,3,5,7,9, "Ted")
}

/**
 * [Return]
 * 함수의 반환형은 접미어로 ':' 을 붙여준다.
 * 반환값이 없을 경우, 접미어를 생략하거나, Unit 타입을 붙여준다.
 */
fun printSum(arg1: Int, arg2: Int): Unit {
    println("sum = ${arg1 + arg2}")
}

fun getSum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

/**
 * [defaultParams]
 * 매개변수 선언 시, default 값을 지정 할 수 있다.
 * 이는 함수 호출 시, 아무런 인자가 들어오지 않게 되면, 자동으로 기본값을 매핑해준다.
 */
fun defaultParams(name: String, email: String? = "none") {
    // Q) null 이 들어왔을때에도 기본값이 매핑이 될까??
    // A) 안됨. 그냥 null 이 들어와버림 따라서, '?:' 심볼로 null 처리를 따로 해주어야 함.
    println("name = $name / email = ${email ?: "none"}")
}

/**
 * [namedParam]
 * 선언된 매개변수가 너무 많고, default 값 지정으로 인해 어떤값이 들어갈지 판단이 어렵다면,
 * 매개변수명과 함께 함수를 호출 할 수 있다.
 */
fun namedParam(name: String, part: String = "probie") {
    // Q) 순서가 바뀌더라도, 매개변수명만 맞다면 제대로 호출을 해줄까?
    // A) 변수명을 명시하면 순서와 상관없이 정상적으로 동작한다.
    println("name : $name / part : $part")

    // Q) 선언한 매개변수 명은 꼭 따라야 하는걸까?
    // A) 당연하게도, 선언 시에 지정한 변수명을 정확이 따르지 않으면, 해당방법을 이용할 수 없다.
}

/**
 * [variableArgument]
 * (동일한 자료형만 들어온가는 가정하에) 가변적으로 인자를 받을 수 있다.
 * 'vararg' 심볼을 통해 특정 자료형을 가변 인자로 받을 수 있다.
 */
fun variableArgument(vararg nums: Int) {
    for(num in nums) {
        print("$num ")
    }
    println()
}

fun variableArguments2(vararg nums: Int, name: String) {
    // Q) 위와 같이 가변인자와 아예 다른 매개변수가 함께 선언이 된다면?
    // A) 가변인수를 사용하고 싶다면, 다른 매개변수는 함께 선언할 수 없다. 따라서, 위와 같은 형태는 불가능한 형태이다.
}


