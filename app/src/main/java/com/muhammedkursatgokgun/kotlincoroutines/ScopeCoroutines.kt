package com.muhammedkursatgokgun.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        launch {
            delay(5000)
            println("runblocking")
        }
        coroutineScope {
            delay(5000)
            println("coroutineScope")
        }

    }
    println("end")
}