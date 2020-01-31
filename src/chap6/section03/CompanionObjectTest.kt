package chap6.section03

/**
 * [Companion Object]
 * 해당 키워드를 통해 정적 메소드/변수 를 사용 할 수 있다.
 * companion object 블록 내에 있는 프로퍼티와 메소드는 객체 생성 없이 접근 가능하다.
 */
class Person(var id: Int = 0, var name: String = "TED") {
    companion object {
        var LANGUAGE = "Korean"
        fun work() {
            println("Working  ...")
        }
    }
}

fun main() {
    println(Person.LANGUAGE)
    Person.LANGUAGE = "English"
    println(Person.LANGUAGE)
    Person.work()
}