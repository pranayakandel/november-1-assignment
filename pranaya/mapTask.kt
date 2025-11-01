package com.example.pranaya

//Create a Dictionary app using mapOf() function where user
//will type a word and your program should return the meaning of that word.

fun main(){
    println("Enter the word for the meaning: ")
    val word = readln()
    val dict = mapOf(
        "Hello" to "A greeting used to express welcome or start a conversation.",
        "World" to "The earth, together with all of its countries and peoples.",
        "Code" to "A system of words, letters, or symbols used to represent others (often refers to computer instructions).",
        "Data" to "Facts and statistics collected together for reference or analysis.",
        "Input" to "What is put in, taken in, or operated on by any process or system.",
        "Output" to "The result or product of a process or system.",
        "Variable" to "A data location that stores a value which can be changed.",
        "Function" to "A block of organized, reusable code that performs a single, related action.",
        "Loop" to "A sequence of instructions that is continually repeated until a certain condition is reached.",
        "Equal" to "Being the same in quantity, size, degree, or value.",
        "Boolean" to "A data type having only two values: true or false.",
        "Integer" to "A whole number (not a fraction) that can be positive, negative, or zero.",
        "String" to "A sequence of characters (e.g., letters, numbers, symbols).",
        "List" to "A simple collection that stores an ordered sequence of items.",
        "Return" to "To give or send something back (in programming, usually the result of a function)."
    )

    println("$word : ${dict[word]}")

}