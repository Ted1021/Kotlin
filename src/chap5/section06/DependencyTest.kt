package chap5.section06

/**
 * [의존관계]
 * 하나의 클래스를 생성하려는데 다른 객체가 먼저 필요하다면,
 * 두 클래스는 서로 의존관계하고 할 수 있다.
 */
fun main() {
    val parent1 = Parent("ASD", 22)
    val child1 = Child("junior", parent1)
    child1.childList()
}

class Parent(val name: String, var id: Int) {
    fun ChildList(c: Child) {
        println("Parent:$name, Child:${c.name}")
    }
}

class Child(val name: String, val p: Parent) {
    val parentId = p.id

    fun childList() {
        println("Parent: ${p.id}, Child:$name")
    }
}