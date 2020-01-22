package chap6.section01

fun main() {
    val user = User(1, "TED", 31)
    user.name = "TED_"
    user.age = 28
}

class User(_id: Int, _name: String, _age: Int) {
    val id = _id
    get() {
        return field
    }
        /* Immutable 인 val 은 setter 설정 불가
    set(value) {
        field = value
    }
         */

    var name = _name
    get() {
        println("get name")
        return field
    }
    set(value) {
        println("set name:$value")
        field = value
    }

    var age = _age
    get() {
        println("get age")
        return field
    }
    set(value) {
        println("set age:$value")
        field = value
    }
}