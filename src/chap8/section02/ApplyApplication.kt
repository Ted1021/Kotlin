package chap8.section02

import java.util.*

fun main() {
    plusAndSlice()
    etc()
}

fun plusAndSlice() {
    // array 는 기본적으로 한번 생성되고나면,
    // 크기가 메모리영역에 고정되게되어 이후 늘리거나 줄일 수 없다.
    val arr1 = arrayOf(1,2,3,4,5)

    // plus 와 slice 와 같은 내부메소드를 제공하는데,
    // 이는 본래의 배열의 크기가 변경되는것이 아닌
    // 새롭게 만들어지는 배열에 덮어씌우는 형태이다.
    val arr2 = arr1.plus(6)
    println("arr2 : ${Arrays.toString(arr2)}")
    val arr3 = arr1.sliceArray(0..3)
    println("arr3 : ${Arrays.toString(arr3)}")
}

fun etc() {
    val arr1 = arrayOf(1,2,3,4,5)
    println(arr1.first())
    println(arr1.last())
    println("average : ${arr1.average()}")
    println("count : ${arr1.count()}")
    println("have 4? : ${arr1.contains(4)}")
    println("have 4? : ${4 in arr1}")
}