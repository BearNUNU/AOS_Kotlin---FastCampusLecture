package com.example.kotlin_advanced

//해당 파일에서 전역적으로 사용 가능하게 main함수 밖에서 사용했지만 null로 지정해놔야하는 케이스가 발생할것이다. ex.) 네트워크 통신으로 받아오는 데이터라면?
var text: String? = null
lateinit var text2: String
val text3 : Int by lazy{
    100 // text3를 호출하는 시기에 초기화를 함 즉 메모리 낭비가 없음
}

fun main(){
    // 초기화 지연 lateinit, lazy //primitive type은 사용이 불가능함
    // lateinit val
    // lazy var

    text = "name1"
    text2 = "name2"
    println(text2)
}