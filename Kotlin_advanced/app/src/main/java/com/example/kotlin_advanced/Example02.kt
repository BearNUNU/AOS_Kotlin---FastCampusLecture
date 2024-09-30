package com.example.kotlin_advanced

fun main(){
    // 확장함수 Extension function
    // 기존의 정의되어 있는 클래스에 함수를 추가하는 기능
    Test().hello()
    Test().hi() //확장되어 호출이 가능함
}

fun Test.hi() = print("하이염")

class Test(){
    fun hello() = println("안녕")
    fun bye() = println("잘가")
} // 예를들어 라이브러리에서 import된 함수라서 변경이 어려울 경우
