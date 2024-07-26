package com.ydmins.project01.basics

fun main(){
    for(i in 1..5){
        println("i in $i")
        if(i==3) break
    }

    label()

    println("End of the Program")
}

fun label(){
    loop@ for(i in 1..5){
        println("i in label $i")
        if(i ==3 ) break@loop
    }
}