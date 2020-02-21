package chap8.section02

import java.util.*


fun main() {
    // array1d()
    // array2d()
    additionalFeatures()
}

fun array1d() {
    val numbers = arrayOf(4, 5, 6, 7)
    for (num in numbers) {
        print("$num/")
    }
    println()
}

fun array2d() {
    val array1 = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf(5, 6, 7, 8)
    val array3 = arrayOf(9, 10, 11, 12)

    // 배열을 다시 배열에 담는 형식으로...
    val array2d = arrayOf(array1, array2, array3)

    // 단일 배열을 받는다는 느낌으로 ...
    for (array in array2d) {
        for (num in array) {
            println("$num/")
        }
        println()
    }
}

fun typedArray() {
    // 기본적으로 arrayOf 로 생성되는 배열은 Any 타입이다.
    val mixedArray = arrayOf(1, 2, 3, 4, "Ted", "Alice")

    // 제네릭을 이용해 자료형을 한정 할 수 있다.
    // 각종 primitive type들에 대해서는 코틀린에서 제공하는 전용 키워드가 있다. ex) intArrayOf ...
    val intArray = arrayOf<Int>(4, 5, 6, 7)
    val intArray2 = intArrayOf(4, 5, 6, 7)
}

fun accessArray() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    // 가져오기 : get({index}) 또는 [{index}] 형태로 인덱스에 직접 접근
    println("getter : ${arr.get(0)}, ${arr[0]}")

    // 대입하기 : set({index}, {value}) 또는 [{index}]
    println("setter : ${arr.set(0, 10)}")
}

fun additionalFeatures() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    // 아래 두 형태로 원시자료형들의 배열에 대해
    // 배열 내부 컨텐츠를 문자열로 변환해주는 기능이 존재함
    println("arr : ${Arrays.toString(arr)}")
    println("arr : ${arr.contentToString()}")

    // 특정 배열타입마다 특별히 제공하는 메소드가 존재
    // Number 타입의 경우, 각 배열요소들간의 합을 계산가능
    println("sum : ${arr.sum()}")
}