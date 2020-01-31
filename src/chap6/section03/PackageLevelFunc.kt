package chap6.section03

/**
 * [PackageLevelFunction]
 * 최상위 레벨 함수란, 특정 클래스를 정의하거나, 객체를 따로 생성하지 않고도 접근 가능한 메소드들을 일컫는다.
 * 해당 함수들을 자바로 역컴파일 해보면 static 메소드임을 확인 할 수 있다.
 */
fun packageLevelFunc() {
    println("package level Function")
}

fun main() {
    packageLevelFunc()
}