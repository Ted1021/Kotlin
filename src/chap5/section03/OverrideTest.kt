package chap5.section03

// [다형성]
// 기본적으로 JAVA 의 abstract 키워드가 Kotlin 의 open 과 동일하다.
// 하위 클래스에서 재정의를 할 수 없도록 만들기 위해서는 final 키워드를 사용하면 된다.

open class Box(var id: Int?, var name: String?) {
    fun secret() {
        println("cannot use this one")
    }
    open fun pleaseUseThis() = println("basic function : id=$id, name=$name")
}

class PlasticBox(id: Int, name: String, var type: String) : Box(id, name) {
    // 자식 클래스의 추상메소드 사용 자체는 override 로 기존 JAVA 와 동일하다.
    override fun pleaseUseThis() {
        super.pleaseUseThis()
        println("purpose is $type")
    }
}

fun main() {
    val plasticBox = PlasticBox(1, "first", "game")
    plasticBox.pleaseUseThis()
}