package com.example.pranaya

fun main(){
    val name : String = "Manjil Kandel"
    print("${name.length}\n")
    val len : Int = name.length
    val name2 : String = "Pranaya Kandel"
    val name3 : String = "No"
    val name4 : String = "    hello   "
    print("${name.equals(name2)}\n")
    print("${name.equals(name3)}\n")
    print(name3.isEmpty())
    print(name.plus(name3))
    print(name.plus(200.3))
    print(name.uppercase())
    print(name.lowercase())
    print(name4.trim())
}