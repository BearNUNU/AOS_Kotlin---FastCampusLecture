package com.example.kotlin_advanced


    /**
     *코드를 좀 더 짧고 명시적으로 사용하기 위해서 탄생
     *객체의 context 내에서, 실행 가능한 코드 블럭을 만드는 함수
     *이 범위 내에서는 이름 없이 객체에 접근이 가능하다.
     *
     *
     * 수식 객체(receiver) - 확장 함수가 호출되는 대상이 되는 값(객체)
     *
     *
     * apply, run, with, also, let
     *
     *
     * 수신 객체 접근 방법 : this, it
     * return 값: 수신객체, 마지막 행(lambda result)
     *
     *
     * let : null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
     * run : 객체를 초기화 하고 리턴 값이 있을 때
     * apply : 객체 초기화
     * also : 수신객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
     * with : 객체 초기화, 람다 리턴 값이 필요 없을 때
     * */
    fun main() {
        /////////////////////////////////////////1. let ///////////////////////////////////////////////////
        val user1 = User("bearNUNU", 10, true)

        // let을 사용하여 user1의 나이에 접근
        val age1 = user1.let {
            it.age  // 'it'은 user1을 참조
        }
        println("user1의 나이: $age1")

        val user2: User? = User("foxNuNU", 20, false)

        // nullable User에 대해 let을 사용하여 안전하게 나이에 접근
        val age2 = user2?.let {
            it.age  // user2가 null이 아닐 경우에만 age에 접근
        }
        println("user2의 나이: $age2")  // user2가 null이면 null 출력


        /////////////////////////////////////////2. run ///////////////////////////////////////////////////
        //수신객체.run{this ->
        //마지막 줄이 리턴
        //}
        val kid = User(name = "baby", 5, false)
        val kidsage = kid.run { this.age }


        /////////////////////////////////////////3. apply ///////////////////////////////////////////////////
        //수신객체.apply{
        //return값이 수신객체 자기 자신
        //}

        val female = User("슬기", 20 , true, true)
        val femailValue = female.apply{
            hasGlasses = false
        }

        /////////////////////////////////////////3. also ///////////////////////////////////////////////////
        // 수신객체.also{it -> (로컬 variable로 선언 가능
        // return 수신객체
        //}
        val male = User("철수", 30, true, true)
        val maleValue = male.also {
          it.name
        }
        println(maleValue)
    }

class User(val name: String, val age: Int, val gender: Boolean, var hasGlasses : Boolean = true)
