package chap7.section02

import java.io.FileNotFoundException
import java.nio.file.Paths

/**
 * [AnnotationClass]
 * @Target : 어노테이션을 적용할 수 있는 범주설정
 * @Retention : 어노테이션의 적용(저장)시점
 * @Repeatable : 같은 요소에 여러번 적용(?) 시킬지 여부
 */
@Target(
        AnnotationTarget.CLASS,             // 클래스
        AnnotationTarget.FUNCTION,          // 메소드
        AnnotationTarget.PROPERTY,          // 프로퍼티
        AnnotationTarget.EXPRESSION,        // 메소드 리턴값
        AnnotationTarget.VALUE_PARAMETER    // 매개변수
)
@Retention(AnnotationRetention.SOURCE)
annotation class Fancy {

}

// 어노테이션의 @Target 에 지정된 범위라면, 아래와같이 사용가능하다
@Fancy class MyClass {
    @Fancy fun myMethod(@Fancy myProperty: Int): Int {
        return (@Fancy 1)
    }
}

/** 표준라이브러리의 어노테이션 **/

// 1. @JvmName("{key}")
// 코틀린에서 아래와 같이 어노테이션을 선언하게 되면,
// 자바에서는 public static final void {key}() {} 와 같이 변환된다.
@JvmName("filterString")
fun filter(list: List<String>): Unit {}

@JvmName("filterInt")
fun filter(list: List<Int>): Unit {}

// 2. @JvmStatic(메소드용), @JvmField(프로퍼티용)
// companion object 내의 요소들에 한해
// 자바의 정적메소드로 변환 시켜준다.
class companionClass {
    companion object {
        @JvmStatic
        fun method() {}

        @JvmField
        val test = 0
    }
}

// 3. @Throw
// 코틀린의 throw 구문이 자바에도 포함되도록한다.
class Flie(val path: String) {
    @Throws(FileNotFoundException::class)
    fun exists(): Boolean {
        val fileNotExists = !Paths.get(path).toFile().exists()
        if(fileNotExists) {
            throw FileNotFoundException("$path does not exists")
        }
        return true
    }
}

// 4. @JvmOverload
// 코틀린의 메소드 오버로딩 구문이 자바에서도 사용할 수 있게끔 함
