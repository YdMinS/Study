package com.ydmins.project01.classes

class Item() {
    var name: String = ""

    constructor(_name: String): this() {
        name = _name
    }

}

fun main(){
    val item = Item("Iphone")
    println("Item name is ${item.name}")
}