package com.example.kotlin

fun main(){
    for (i in 1..100){
        println(i)
    }

    1..100
    IntRange(1,100)
    1 until 100  //끝은 범위에 포함하지 않음

    for(i in 1..100 step 2){
        println(i)
    }

    for(i in 100 downTo 1 step 2 ){
        println(i)
    }
    var c= 0
    while (c < 11){
        println(c)
        c++
    }
}