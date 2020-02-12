package chap7.section02

sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status : Result()
class Inside : Result.Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

// 모든 경우의 수에대해 정의가 되었으므로, 따로 else 를 표기 해 줄 필요가 없다.
// 반대로, sealed class 에 정의 된 모든 클래스들은 when 문으로 받을때, 모든 경우의 수에대해 매칭이 되어야만 한다.
fun eval(result: Result): String = when (result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}