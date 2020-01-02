package chap2.section03

/**
 * # Null Check
 * 1. 변수 선언 시,
 *    - '?' 심볼을 통해 nullable 여부를 사용자가 지정 해 줄 수 있다.
 *
 * 2. 변수 사용 시,
 *    1) 세이프티콜(?.)
 *        - Kotlin 은 기본적으로 null 을 허용하지 않는데, 안전하게 null 일때에도 특정 동작을 수행하게 할 수 있다.
 *    2) non-null(!!.)
 *        - 사용자가 non-null 임을 보장하는 심볼로, 혹여나 null 값이 들어 오게 된다면, runtime exception 이 발생한다.
 *        - 혹은 null pointer exception 을 일부러 발생시키기 위해 사용할 수 있다.
 *
 * 3. elvis operator
 *     - null 일 경우, 사용해야하는 값을 지졍해주는 연산자.
 *     - 보통 safety call 과 함께 사용한다.
 */
fun main() {
    // 1. nullable 선언
    val str = "ted"
    var nullStr: String? = "ted example"
    nullStr = null

    // 2. 세이프티 콜
    println("Str : $str / length : ${str.length}")
    println("nullStr : $nullStr / length : ${nullStr?.length}")

    // 3. non-null symbol
    // println("nullStr : $nullStr / length : ${nullStr!!.length}")

    // 4. elvis operator
    println("nullStr : ${nullStr?:"empty"} / length : ${nullStr?.length?:-1}")
}