package com.example.kotlin

fun main(){
    max(a= 10, b= 20)
}

fun max(a: Int, b : Int){
    if(a>b){
        println(a)
        //코틀린에서는 state가 아니라 expression이기 때문에 return값을 가질 수 있다. 아래의 result가 해당 예시
    }
    else {
        println(b)
    }

    val result = if(a>b){
     a
        //코틀린에서는 state가 아니라 expression이기 때문에 return값을 가질 수 있다.
    }
    else {
       b
    }

    println("result $result")
}

fun isHoliday(dayOfWeak: String){
    when(dayOfWeak) { //when 또한 state가 아니라 expression이기 때문에 변수에 결과를 할당 할 수 있음
        "토" -> {
            println("휴일")
        }
        "일" -> {
            println("휴일")
        }
        else -> {
            println("출근해야지..")
        }
        // in.., in listOf("월", "화")
    }
}