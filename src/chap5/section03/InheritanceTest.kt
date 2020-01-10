package chap5.section03

// 상속
// JAVA 와 달리, 상속가능한 클래스를 만들기 위해서는 'open' 키워드를 붙여주어야 한다.
// 클래스 선언과 변수 선언 시, 뒤에 붙이게 되는 콜론의 띄어쓰기를 유의 해야한다.
// 지키지 않아도 별 문제는 없지만, 클래스 뒤는 한칸 띄우고, 변수 뒤는 붙여서 서로를 구분해 준다.

// 1. 상속클래스
// open 키워드로 상속 가능한 클래스임을 지정
open class BaseClass(var id: Int, var address: String) {
    fun mainInfo() = println("id=$id / address=$address")
}

// 2. 주 생성자를 사용하는 상속
// 주 생성자를 사용하는 상속의 경우,
// 부모 클래스 명을 콜론 뒤에 붙여 주어야 한다.
class SubClass01(id: Int, address: String) : BaseClass(id, address) {
    fun reservation() = println("make a reservation")
}

// 3. 부 생성자를 사용하는 상속
// constructor 를 사용하는 상속의 경우,
// 부모 클래스 명 대신, constructor 메소드 뒤에 super 키워드를 붙여준다.
class SubClass02 : BaseClass {
    val language: String

    constructor(id: Int, address: String, language: String) : super(id, address) {
        this.language = language
    }

    fun location() = println("lan : $language | addr : $address")
}