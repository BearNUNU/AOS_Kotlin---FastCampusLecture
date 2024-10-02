package com.example.kotlin_advanced


/**
 * date class 데이터를 담기 위한 클래스
 * */
fun main (){
    val person = Person("수지", 20)
    val dog = Dog("몽자", 5)

    println(person.toString()) // 참조값이 출력
    println(dog.toString()) // 이름과 나이가 출력
    println(dog.copy(age =5).toString())

    val cat:Cat = BlueCat()
    val result = when(cat){
        is BlueCat -> {}
        is RedCat -> {}
        is YellowCat -> {}
        else -> {}
    }
}


class Person(
    val name: String,
    val age: Int,
)

data class Dog(
    val name: String,
    val age: Int,
)

//sealed class

//abstract  class Cat
sealed class  Cat  // 컴파일러가 자식 클래스가 어떤 것인지 알게된다. when과 사용하면 편리하다
class BlueCat : Cat()
class RedCat : Cat()
class YellowCat : Cat()