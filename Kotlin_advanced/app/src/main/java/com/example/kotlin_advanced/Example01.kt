package com.example.kotlin_advanced

fun main() {
    // 1. 익명함수
    // 2. 람다식 -> 변수처럼 사용이 가능하다 -> 어떤 함수의 argument로 들어갈 수 있고, 어떤 함수의 return 값이 될 수 있다.
    // 3. 한 번 사용되고, 재사용되지 않는 함수

    val a = fun() { println("익명함수") }

    val b: (Int) -> Int = { it * 10 }

    println(b(10))

    val d = { i: Int, j: Int ->
        i * j //내부에서 타입 지정이 가능하다
    }

    fun hello(a:Int, b: (Int) ->Int){
        println(a)
        println(b(2))
    }


    hello(1, b)
}