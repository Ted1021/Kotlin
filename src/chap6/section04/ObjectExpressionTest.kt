package chap6.section04

open class SuperMan() {
    fun work() = println("[SuperMan] Taking photos")
    fun talk() = println("[SuperMan] Taking with people")
    open fun fly() = println("[SuperMan] Flying in the air")
}

fun main() {
    // 상속받아 재정의 하고 싶지만, 자식 클래스를 정의하고싶지 않을때,
    val pretendMan = object : SuperMan() {
        override fun fly() {
            super.fly()
            println("> I'm not a real super man. actually i cannot fly :( ")
        }
    }

    pretendMan.work()
    pretendMan.talk()
    pretendMan.fly()

    val superGirl = SuperMan()
    superGirl.work()
    superGirl.talk()
    superGirl.fly()
}