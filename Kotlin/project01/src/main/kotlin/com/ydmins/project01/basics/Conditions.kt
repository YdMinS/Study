package com.ydmins.project01.basics

fun main(){

    var name = "Alex"
    name = "chldis"
    if(name.length === 4){
        println("Name is Four Characters")
    } else {
        println("Name is not Four Characters")
    }

    val position= 7
    val medal = if(position == 1){
        "GOLD"
    } else if (position ==2){
        "SILVER"
    } else if (position ==3){
        "BRONZE"
    } else{
        "NO MEDAL"
    }

    println(medal)

    var position2 = 3
    val medal2 = when(position2){
        1 -> {"GOLD"}
        2 -> {"SILBER"}
        3 -> {"BRONZE"}
        else -> {"NO MEDAL"}
    }

    println(medal2)
}