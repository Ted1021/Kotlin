package chap2.section02

/**
 * # Kotlin 의 자료형
 * 1. primitive type 이 아닌 항상 reference type 으로 처리
 * - 다만 kotlin compiler 내부에서 reference type 을 primitive type 으로 변환해준다.
 *
 * 2. 자동으로 형변환을 진행 해 준다.
 */
fun main() {

    // 1. 자동 형변환
    val num01 = 123     // Int
    val num02 = -12345  // Int
    val num03 = 123F    // Float
    val num04 = 123L    // Long
    val num05 = 922337293685477023  // Long

    // 2. 가독성을 위한 언더스코어 표기법
    val num06 = 1_000_000   // Int
    val num07 = 1234_1234_1234_1234L // Long
    val num08 = 0xAB_CD_EF_12

    // 3. Unsigned Type (after kotlin version 1.3)
    val uInt = 13u

    // 4. 실수 자료형
    val num09 = 3.14E-2     // 왼쪽으로 소수점 2칸 이동 = 0.0314
    val num10 = 3.14e2      // 오른쪽으로 소수점 2칸 이동 = 314

    // 5. 각 자료형의 최대/최소 값
    val intMin = Int.MIN_VALUE
    val intMax = Int.MAX_VALUE
}