package com.example.pranaya

fun main(){
    print("hello")
    println("word")

//    string name = "pranaya"

    var name : String = "pranaya"
    val age : Int =18
    val terms : Boolean = false
    val weight : Double = 0.0

    //my name is pranaya and age is 18

    print("my name is" + name + "and age is" + age)
    print("my name is ${name.uppercase()} and age is $age")

    var age = arrayOf(10,20,30)
    age[3] = 50
    println(age[3])

    var name = ArrayList<String>()
}

