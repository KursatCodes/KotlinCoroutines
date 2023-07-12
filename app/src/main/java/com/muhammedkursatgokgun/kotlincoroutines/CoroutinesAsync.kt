package com.muhammedkursatgokgun.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val name = async {
            downloadName()
        }
        val age = async {
            downloadAge()
        }
        var namem = name.await()
        var agem = age.await()
        println(namem+" "+agem)
    }
}

suspend fun downloadName(): String{
    delay(2000)
    return "Muhammed"
}

suspend fun downloadAge():Int{
    delay(3000)
    return 28
}