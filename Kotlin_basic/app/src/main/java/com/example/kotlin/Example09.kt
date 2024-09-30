package com.example.kotlin

fun main(){
    check("abc")
}

fun check(a:Any){ //when문으로도 사용 가능
    if(a is String){
       println("문자열")
    }else{
        println("문자열 아님")
    }
}

fun cast(a: Any){
    val result = a as? String ?: "값이 String이 아님"// String이 아니라면 null로 될것
    println(result)
}

fun smartCast(a: Any){
    if(a is String){
        a.length
    }else if (a is Int){
        a.dec()
    }
}