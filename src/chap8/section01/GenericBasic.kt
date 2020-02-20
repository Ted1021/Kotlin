package chap8.section01

class MyClass<T>(value: T) {
    // 인스턴스화 되지않으면, 프로퍼티의 자료형을 특정지을 수 없으므로, 사용불가.
    // 이와 같이 사용하기 위해서는 클래스의 생성시점에 자료형을 특정 지을 수 있도록 생성자 정의 필요.
    val myValue: T = value

    // 인스턴스화 될때 인입되는 자료형으로 동작하게끔 되어있음
    fun myMethod(a: T) {
    }
}

// 사용자가 null 을 허용하는 실수를 원천적으로 막기위해서는
// 제네릭의 자료형을 'Any' 로 선언해주면 된다.
class GenericNull<T: Any> {
    fun equalityFunc(arg1: T, arg2: T) {
        println("${arg1 == arg2}")
    }
}

fun main() {
    var a = MyClass<Int>(13)

    println(a.myValue)
    println(a.javaClass)

    // '?' 심볼이 없으면 기본적으로 non-null
    val obj1 = GenericNull<String>()
    obj1.equalityFunc("Hello", "World")

    // '?' 심볼을 명시하여, nullable 을 표현
    val obj2 = GenericNull<Int>()
    obj2.equalityFunc(20, 10)
}