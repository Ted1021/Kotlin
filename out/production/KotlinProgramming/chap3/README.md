# Chap03. 함수와 함수형 프로그래밍

### 1. Kotlin 함수선언

> 코틀린에서의 매개변수, 반환형 선언은 다음과 같다.
>
> 만약, 매개변수를 바로 반환값으로 사용 할 수 있다면, 람다식과 비슷하게 축약할 수 있다.

```kotlin
// fun '함수이름' ('변수명: 자료형') :'반환형'
fun sum(x: Int, y: Int): Int {
    return x + y
}

// 함수 축약
fun sum(x:Int, y: Int) = x + y
```

<br>

### 2. Kotlin 함수의 특이점

#### 1) **반환값이 없는 함수**

> Java 의 void 형과 비슷하게 Kotlin 에서는 Unit 을 사용
>
> 차이점이라면, void 는 실제로 아무값도 리턴하지 않지만, Unit 은 내부적으로 리턴값이 존재

```kotlin
fun printSum(a: Int, b: Int): Unit {
    println("a = $a / b = $b")
}
```

<br>

#### 2) 매개변수의 활용

> Java 와 달리 매개변수에 다양한 기능들을 추가로 제공하고 있다.

- **기본값 설정**
  - 함수 호출 시, 인자를 전달하지 않은 매개변수에 대해 기본값을 설정 할 수 있다.

```kotlin
// 선언하는 매개변수 마지막에 '=(원하는 기본값)' 형태로 설정 할 수 있다.
fun regist(name: String, email: String = "none") {...} 
.
.
.
regist("Ted", "kimtx200@gmail.com")
regist("Alice") // overloading 없이 email 필드를 "none" 으로 초기화 할 수 있다.
```

