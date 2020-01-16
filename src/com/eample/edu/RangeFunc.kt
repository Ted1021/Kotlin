package com.eample.edu

fun main() {

}

// T : 수신객체 / R : 수신객체 지정람다
inline fun <T, R> with(receiver: T, block: T.() -> R): R {
    return receiver.block()
}

// T의 확장함수로 암시적으로 수신객체가 제공 됨
inline fun <T, R> T.also(block: (T) -> Unit): T {
    block(this)
    return this
}

//
inline fun <T, R> T.let(block: (T) -> R): R {
    return block(this)
}

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T, R> T.run(block: T.() -> R): R {
    return block()
}