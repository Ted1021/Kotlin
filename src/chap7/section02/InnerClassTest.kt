package chap7.section02

/**
 * Inner Class 의 경우, Nested Class 와 같이 Static 속성을 가지지는 않는다.
 * 특징으로는 상위클래스의 private 요소까지 모두 접근 가능하다는 점이다.
 */

class SmartPhone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        // cpu 가 private 임에도 불구하고 접근 가능
        fun getInfo() = "${model}:Installed on $cpu with ${size}Gb"
    }
}

class Computer {
    inner class Model {
        fun getInfo() = println("this is inner class")
    }
}

fun main() {
    val myCard = SmartPhone("S10").ExternalStorage(32)
    println(myCard.getInfo())

    // Nested Class 와는 다르게, 객체생성없이 접근불가능.
    // Computer.Model().getInfo
}