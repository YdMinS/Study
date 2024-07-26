package com.ydmins.project01.classes

data class Course (
    val id: Int,
    val name: String,
    val author: String
)

fun main(){
    val course = Course(1, "A", "B")
    println(course)
}