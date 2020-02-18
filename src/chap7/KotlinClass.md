# Kotlin Class

> 자바에서 쓰는 여러가지  Class 사용방식이 Kotlin 에서는 어떻게 쓰이고 있는지 확인한다.



### 1. Nested Class

> 자바의 static class 로써, 단순히 특정 클래스안에 다른 클래스를 중첩시켜 표현하는 방식이다.

- **특징**
  - **static** 클래스이기 때문에, 상위클래스의 생성없이 바로 접근 가능하다.
  - Companion object 로 묶여있는 상위클래스의 요소(멤버변수, 메소드 등)에 자유롭게 접근 가능하다.

```kotlin
class A {
    companion object {
        val text = "text"
        fun getSomething() {}
    }

    // 아무런 키워드없이 클래스를 단순하게 중첩시킨다.
    class B {
        fun test() {
            // 상위클래스의 companion object 요소에 자유롭게 접근가능
            println(text)
        }
        fun test2() {
            getSomething()
        }
    }
}
```



### 2. Inner Class

> 자바의 중첩클래스로써, 자바에서 단순히 클래스를 중첩시켜쓰는 방식을 코틀린에서는 반드시 **inner class** 라는 키워드를 사용해야만 한다.

- **특징**
  - static 클래스가 아니므로, 상위클래스를 반드시 생성한 뒤에 접근이 가능하다.
  - 상위클래스의 모든요소에 제한 없이 접근가능하다.
    - 심지어 private 컴포넌트들도 접근가능



### 3. Local Class

> 블록단위로 정의 된 영역 내에서만 유효한 클래스

```kotlin
class Smartphone(val model: String) {
    private val cpu = "Exynos"
    
    fun powerOn(): String {
        // 특정 메소드블록 내에서만 유효한 클래스
        class Led(val color: String) {
            // 상위클래스의 프로퍼티 또한 접근가능
            fun blink(): String = "Blinking color : $color on $model"
        }
        
        val powerStatus = Led("RED")
        return powerStatus.blink()
    }
}
```



### 4. Object Class

> 일명 **익명객체**로써, 재사용되지않고, 일회성으로 이용하는데 쓰인다.

- **특징**
  - object 키워드를 통해 일회성으로 생성되는 클래스를 만들 수 있다.

```kotlin
val a = object{
    fun on() {
        
    }
}

fun main() {
    a.on()
}
```



### 5. Enum Class

> 자바와 동일하게 사용된다.

- **특징**
  - 코틀린에서는 Enum 클래스 정의 및 생성하는 방법이 특이한것이 아니라, Enum 클래스를 보다 편하고 직관적으로 사용하기위한 기능들을 다양하게 제공한다.
    - when 구문을 통한 간편한 분기문 작성
    - Enum 클래스 내, 메소드 작성 가능
    - Enum 타입별 인터페이스 상속가능



### 6. Sealed Class

> Enum 클래스와 동일하게 특정 상황이나 상태 값등을 정의하기위해 사용된다.
>
> 다른점이라면, 한가지 자료형만 정의 할 수 있는 Enum 클래스와는 달리 여러 자료형을 섞어서 사용가능하다.

