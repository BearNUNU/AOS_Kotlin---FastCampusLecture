package com.example.kotlin

fun main(){
    // 코틀린에서는  mutable이 가장 큰 특징이다.
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)

    val list2 = listOf(1,2,3,4)
//    list2.add 불가능함

    println(list.joinToString(","))

    val map1 = mapOf((1 to "안녕"), (2 to "hello"))
    val map2 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map2[3] = "응"
    
}