package com.ydmins.project01.basics

fun main(){
    val name = "YDMINS"
    println(name)

    var age = 30
    println(age)
    age = 40
    println(age)

    val salary = 3000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC\nDEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiLine1)
}