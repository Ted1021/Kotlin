package chap6.section04

interface Shape {
    fun onDraw()
}

fun foo() {
    // 객체는 필요하지만, 상위 클래스나 인터페이스가 존재하지 않는경우
    // object 객체 (익명객체) 로 선언하고 접근 가능하다.
    val hoc = object {
        var x  = 0
        var y = 10
    }
    println("x=${hoc.x}, y=${hoc.y}")
}

class C {
    // 익명객체가 선언되면,
    // 지역 또는 private 정의 영역 내에서만 사용 가능하다.
    private fun foo() = object {
        val x: String = "x"
        val num: Int = 1
    }

    // 만약 익명객체가 public 으로 선언된다면,
    // 반환형은 상위객체가 되거나, 없을경우 Any 형이 된다.
    fun foo2() = object {
        val y: String = "y"
    }

    fun bar() {
        // private 정의 영역 내에 있어, (같은 C 클래스의 멤버)
        // 선언된 프로퍼티로 접근 가능하다.
        val x1: String = foo().x
        val num1 = foo().num

        // Any 로 판단되기 때문에 내부 프로퍼티를 알 수 없다.
        // val x2 = foo2().x
    }
}

fun main() {

    // 딱 한번만 정의되면 되는 인터페이스의 경우 사용
    val triangle = object : Shape {
        override fun onDraw() {
            println("Draw Something")
        }
    }

    triangle.onDraw()
}


