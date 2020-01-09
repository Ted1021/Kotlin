# Chap4. 프로그램 흐름제어

### 1. When

- 기존 Java 의 if / else 문을 When 을 통해 보다 간단하게 표현 할 수 있다.

- 인자를 받는 경우와 받지 않는 경우에 따라 사용법이 조금씩 다르며, 활용범위도 달라지게 된다.

  - 인자를 받는 경우,
    - 굉장히 간단하게 축약하여 코드를 최대한 간단하게 만들 수 있지만, 조건문에 대한 제약이 '약간' 생긴다.
  - 인자를 받지 않는 경우,
    - 좀더 복잡한 조건문을 구성 할 수 있지만, 코드의 간결성이 '약간' 떨어진다.

  ~~~kotlin
  fun grade() {
      // when 과 in 을 조합하여 간단한 범위 조건문을 만들 수 있다.
      // 'in' 키워드는 이상, 이하 범주만 체크 가능하다.
      // 인자를 받는 when 은 디테일한 조건문을 작성 할 수 없다.
      print("score : ")
      val score: Double = readLine()?.toDoubleOrNull() ?: -1.0
      var grade: String = "F"
  
      when (score) {
          in 90.0..100.0 -> grade = "A"
          in 80.0..89.9 -> grade = "B"
          in 70.0..79.9 -> grade = "C"
          else -> "F"
      }
  
      println("grade : $grade")
  }
  ~~~

<br>

#### 1) 특징

- Java 의 if / else 문을 단순히 대체하는것이 아니라, __Any__ 자료형을 이용해 다양한 자료형에 대한 동작을 구현 할 수 있다.

~~~kotlin
// is 심볼을 이용해 Java 의 instanceof 를 대체 할 수 있다.
// String 비교의 경우, 아래와같이 인자가 있는 When 문은 단순히 equals 와 동일하게 동작한다.(IgnoreCase 안됨)
// Kotlin 에서 제공하는 참조형 뿐만아니라 사용자 지정 객체 또한 When 의 조건문으로 삽입이 가능하다.
fun typeCase(obj: Any) {
    when(obj) {
        is Int -> println("Integer : $obj")
        is Long -> println("Long : $obj")
        "Hello" -> println("String : $obj")
        is Person -> println("Person : id = ${obj.id} | name = ${obj.name}")
        else -> println("Nothing")
    }
}
~~~

