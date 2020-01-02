package chap2.section02

/**
 * # 문자열의 특징
 * 1. 기본적으로 '$value' 심볼을 이용해 formatting 을 할 수 있다.
 * 2. formatting 에 표현식을 사용 할 수 있다.
 * 3. 다중 문자열을 표현 할 수 있다.
 */
fun main() {

    // 1. 기본적인 formatting
    val num = 20
    val str1 = "a = $num"           // 동적으로 들어오는 변수에 항상 $ 심볼을 붙여주면 된다.
    val str2 = "a = ${num + 10}"    // 표현식을 formatting 에 포함 시킬 수 있다.
    println(str1)
    println(str2)

    // 2. 다중 문자열
    val str3 = """
        돈많은
        백수가
        최고다
    """.trimIndent()    // 다음과 같이 큰따옴표 세개로 다중문자열을 표현 할 수 있다.
    println(str3)
}