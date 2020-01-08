package chap4.section02

/**
 * [Label]
 * Kotlin 에서는 Label 을 사용한 위치로 'return, continue, break' 를 사용할 수 있다.
 */
fun main() {
    var str1: String? = "Hello"
    var len = str1?.length ?: -1

    first@for(i in 1..5) {
       second@for(j in 1..5) {
           if(j in 3..4) {
               break@second
           } else if(i == 5){
               break@first
           } else {
               println("i:$i, j:$j")
           }
       }
        println("after for 'j'")
    }
    println("after for 'i'")
}