package com.example.kotlin

fun main(){
    var name : String = "상아"
//    name = null 오류가 발생함
    var name2 : String? = "상아" //nullable하게 만들어줌 타입 뒤에 ? 추가
    name2 = null

    var nickName: String? =null

    val result = if(nickName=== null){
        "값이 없음"
    } else{
        nickName
    }

    println(result)
// 위의 코드 대신 엘비스로 작성 가능하다
    val result2 = nickName?: "값이 없음"
    
    
    val size = result2?.length
    // !!로 null이 아님을 확식할수있음
}