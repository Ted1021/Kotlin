package chap7.section02

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(Color.BLUE.rgb())

    val _name = Color.RED
    println(getColor(_name))

    val _toString = Color.YELLOW
    println(getColor(_toString))

    val _default = Color.GREEN
    println(getColor(_default))

}

fun getColor(color: Color) = when(color) {
    Color.RED -> color.name             // 상수의 이름자체
    Color.ORANGE -> color.ordinal       // enum 내의 순번
    Color.YELLOW -> color.toString()    // 문자열 반환
    Color.GREEN -> color                // 기본값(문자열)
    Color.BLUE -> color.r               // 클래스 프로퍼티
    Color.INDIGO -> color.g
    Color.VIOLET -> color.rgb()         // 클래스 메소드
}