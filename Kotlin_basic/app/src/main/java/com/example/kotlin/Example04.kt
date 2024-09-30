package com.example.kotlin

fun main(){
    val user = User("BearNuNu", age = 20)
    println(user.name)
    val user2 = User("baby")
    println(user2.age)
    val kid = Kid(name = "아이", age = 3, gender = "male")
}

open class  User(open val name: String, open var age: Int = 0)


class  Kid(override val name: String, override var age: Int) : User(name, age){
    var gender: String = "female"
    
    init {
        println("초기화")
    }
    constructor(name: String, age: Int, gender: String) : this(name, age){
        this.gender = gender
        println("부생성자 호출")
    }
}