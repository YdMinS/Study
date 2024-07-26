package com.ydmins.project01.functions

const val courseName = "Kotlin Protramming"

fun topLevelFunction() : Int {
    return (1..100).random()
}

fun main(){
    val random = topLevelFunction()
    println("Random Value is $random")
}