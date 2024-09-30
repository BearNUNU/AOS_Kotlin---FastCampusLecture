package com.example.kotlin

fun main(){ //코틀린의 엔트리 포인트
    println("hello world")
    println(test(1,2,3))
    println(add(b=2, a=1)) // 넘어갈 인자를 명시하면 순서는 상관 없어짐
    test2(name = "김씨", nickName = "nunu", id = "BearNuNu")
}

// 02. 함수
fun test(a: Int, b: Int, c:Int) : Unit {
    println("test")
}

fun add(a: Int, b: Int = 5) : Int {
    return a+b
}

fun test2 (name: String, id: String, nickName: String) = println(name+id+nickName) //Single Expression