package com.example.kotlin_advanced


/**
 * Object, Companion
 * Object - 클래스를 정의함과 동시에 객체를 생성, 싱글톤을 쉽게 만드는 키워드
 *
 * Companion object - java의 static과 같은 역할
 * */

fun main(){
    Counter// 이미 생성되어있음, 싱글톤이라 딱 한번만 초기화됨
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    Counter.countUp()
    println(Counter.count) // 싱글톤이기 때문에 3일것이다.
    Counter.hello()

    Book.NAME
}

object  Counter: Hello(){
    init {
        println("Counter 초기화")
    }
    var count : Int = 0
    fun countUp(){
        count++
    }

}

open class  Hello(){
    fun hello( ) = println("hellow")
}

open class Book(){

    companion object{
    val NAME = "name"
        
    }
}