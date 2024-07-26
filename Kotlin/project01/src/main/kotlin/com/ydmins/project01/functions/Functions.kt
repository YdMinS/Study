package com.ydmins.project01.functions

import java.time.LocalDate

fun printName(name : String) :Unit{
    println("Name is : $name")
}

fun addition(x: Int, y: Int): Int{
    return x + y
}

fun addition_approach1(x:Int, y:Int) = x+y

fun printPersonDetails(
    name : String,
    email : String = "",
    dob : LocalDate = LocalDate.now()
){
    println("Name is $name and the email is $email and the dob is $dob")
}

fun main(){
    printName("YDMINS")
    val result = addition(1, 2)
    println("Result is $result")
    val result2 = addition_approach1(1, 3)
    println("Result is $result2")

    printPersonDetails("YDMINS", "email@email.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("YDMINs")
}
