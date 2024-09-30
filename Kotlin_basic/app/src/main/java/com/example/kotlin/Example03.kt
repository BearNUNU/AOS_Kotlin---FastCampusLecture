package com.example.kotlin

fun main(){
    // 3. 변수
    // val = value (값)
    // var = variable (변경 가능한)
    val a : Int = 4
    var b : Int = 5
//    a = 10 재할당 시 오류가 발생한다.
    b = 10

    val name = "BearNUNU" // 코틀린은 기본적으로 변수에 대한 타입 추론 기능을 제공하기 때문에 name 뒤에 : String이라고 타입 명시를 추가하지 않아도 오류가 발생하지 않는다.
}