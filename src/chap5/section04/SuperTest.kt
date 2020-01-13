package chap5.section04

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing : $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot(name: String, wing: Int = 2, beak: String, color: String, var language: String = "KOR") : Bird(name, wing, beak, color) {
    fun speak() = println("Speak! $language")

    // 상위 클래스 상속
    override fun sing(vol: Int) {
        super.sing(vol) // super 를 통해 상위 클래스의 메소드 호출
        println("I'm a parrot! the volume level is $vol")
        speak()
    }
}
