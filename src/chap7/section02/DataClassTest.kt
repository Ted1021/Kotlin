package chap7.section02

/**
 * [DataClass]
 * # 순수히 데이터만을 다룰때 유용한 클래스로, 아래의 특징을 가진다.
 * 1. 기본적으로 equals(), hashCode(), toString() 과 같은 기본적인 메소드를 제공
 * 2. 최소 하나의 매개변수는 가져야 함
 * 3. abstract, open, inner, sealed 등 과 같은 클래스용 키워드를 사용할 수 없음
 * 4. 부생성자, init 과같은 간단한 로직 이외에는 되도록 사용하지않는것이 중요
 */
data class Customer(var name: String, var email: String)

fun main() {
    val cus1 = Customer("Sean", "sean@google.com")
    val cus2 = Customer("Mean", "mean@google.com")
    val cus3 = Customer("Ted", "ted@google.com")
    val cus4 = Customer("Alice", "alice@google.com")

    val (name, email) = cus1
    println("class destructuring | cus1 : name=$name, email=$email")

    val customers = listOf(cus1, cus2, cus3, cus4)
    for((name, email) in customers) {
        println("name=$name, email=$email")
    }

    val (unknown, addr) = myFunc()
    println("unknown=$unknown, addr=$addr")

    // 매개변수 디스트럭쳐링
    val myLambda = {(nameLa, emailLa): Customer -> {
        println(nameLa)
        println(emailLa)
    } }
}

fun myFunc(): Customer {
    return Customer("ASDASD", "asd@aSD.asd")
}