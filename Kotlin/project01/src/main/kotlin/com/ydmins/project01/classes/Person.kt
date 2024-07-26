package com.ydmins.project01.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String =""
    init{
        println("Init Block")
    }

    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0) : this(_name, _age){
        email = _email
    }
    fun action(){
        println("Person walks")
    }
}

fun main(){
    val person = Person("Ydmins", 20)
    person.action()
    println("Name : ${person.name} and the age : ${person.age}")

    val person1 = Person()
    println("Name : ${person1.name} and the age : ${person1.age}")

    val person2 = Person(_email = "test@mail.com", "Ydmins", 20)
    println("Name : ${person2.name} and the age : ${person2.age} and the email : ${person2.email}")
}