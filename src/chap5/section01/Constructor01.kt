package chap5.section01

// 주 생성자 위치
// 주 생성자에 클래스에 필요한 프로퍼티를 설정 할 수 있음.
class BlueBird// 부 생성자의 경우, 주 생성자 표기와 함께 쓸 수 없다.
    (_name: String, _wing: String, _color: String) {
    var name: String = _name
    var wing: String = _wing
    var color: String = _color
    var isBird: Boolean = false

    // 주 생성자 없이, 부 생성자로 초기화 된 프로퍼티들은 initialization 에러가 발생한다.
    init {
        println("------ start init ------")
        println("이름은 $name, 부리는 $color 색")
        this.wing = "zzzz"
        println("------ end init -------")
    }
}