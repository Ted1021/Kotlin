package chap6.section03

/**
 * 자바에서도 코틀린의 정적 클래스, 메소드, 변수를 사용하기위해서는 아래의 처리들이 별도로 필요하다.
 * 필수는 아니지만, 사용하지않을 경우, 자바에서 접근할 때, 항상 Companion 이라는 키워드를 사용해 주어야 한다.
 *
 * 1. const
 * - primitive type 이나 String 자료형에만 사용 할 수 있다.
 * 2. @jvmStatic
 * - 프로퍼티나, 메소드에 모두 사용 가능하다.
 * 3. @jvmField
 * - 사용자가 정의한 특정 자료형을 사용 할 수 있다.
 */

class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...")
        @JvmField val JOB = KJob()
    }
}

class KJob {
    var title = "Programmer"
}
