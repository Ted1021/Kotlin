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
  - 오버로딩된 함수가 존재 할 경우, default 값이 설정된 함수보다 우선적으로 호출 된다.
  - 일부러 null 값을 전달할 경우, default 값은 적용되지않는다. (null 이 그대로 전달 됨)

```kotlin
// 선언하는 매개변수 마지막에 '=(원하는 기본값)' 형태로 설정 할 수 있다.
fun regist(name: String, email: String = "none") {...} 
.
.
.
regist("Ted", "kimtx200@gmail.com")
regist("Alice") // overloading 없이 email 필드를 "none" 으로 초기화 할 수 있다.
```

<br>

- **매개변수 이름과 함께 호출하기**
  - 함수 호출 시, 인자를 전달 할 때, 매개변수 명을 붙여서 전달 할 수 있다.
    - 매개변수가 많고, 선언된 default 값이 많아 입력값을 정확히 할 수 없다면, 유용하게 쓸 수 있다.
  - 인자전달순서와 상관없이 정상적으로 동작한다.

```kotlin
fun namedParams(x: Int = 100, y: Int = 50, z: Int) {...}
.
.
.
namedParams(z = 70, y = 100) // 순서와 상관없이 인자가 전달되고, 없는 값은 default 값을 적용 할 수 있음
```

<br>

- **가변인자**
  - 갯수가 가변적으로 변할 수 있는 매개변수를 지원한다.
    - **vararg** 키워드를 이용해 가변적으로 인입될 수 있는 매개변수를 선언
    - 고정 매개변수와 함께 사용하고 싶다면, 고정매개변수 명을 인자에 명시적으로 표현해주면 된다.

```kotlin
fun variableArgs01(tag: String, vararg counts: Int) {...}
fun variableArgs02(vararg counts: Int, tag: String) {...}
.
.
.
// 다음과 같이 추가적으로 함수를 오버로딩 하지 않아도, 가변적인 매개변수에 대응 할 수 있다.
variableArgs01("Ted", 1, 2, 3)
variableArgs01("Ted", 2, 4, ,6 ,8, 10)

// 다만, 고정매개변수가 마지막 순서의 매개변수로 선언 된다면, 가변매개변수와 구분하기 위해 반드시 명시적으로 매개변수명을 표기해주어야 한다.
variableArgs02(1, 2, 3, 4, 5, tag = "Ted")
```

<br>

### 3. 람다식과 고차함수

#### 1) 람다식

- **일급객체**
  - 함수형 프로그래밍에서는 함수를 일급객체로 표현 함.
  - 일급객체는 아래의 특징을 가짐
    - 특정함수의 매개변수로 사용 가능한 함수
    - 특정함수의 반환값으로 사용 가능한 함수
    - 특정변수에 대입 될 수 있는 함수
- **람다식**
  - 이름이 없는 일급객체

```kotlin
fun main() {
    test(sum, 1, 2)
}

// 특정 변수에 대입
val sum: (Int, Int -> Int) = {x, y -> x + y}

// 메개변수나 반환값에 사용
fun test(sum: (Int, Int -> Int), x: Int, y: Int): Int = sum(x, y)
```

<br>

#### 2) 고차함수

- 함수의 매개변수나 반환형에 일급객체가 사용 된 함수

<br>



### 4. CallByName

- 람다식의 경우, 기존에 사용해 오던 CallByValue 형태의 호출 뿐만아니라, CallByName 형태로 호출 할 수 있다.
- 두 호출 방식은 서로 다르게 동작하므로 주의해야 한다.



### 5. 참조에 의한 외부함수 호출

- 2개의 콜론(::) 키워드를 이용해 일반 함수를 타 함수의 인자로 전달 할 수 있다.



