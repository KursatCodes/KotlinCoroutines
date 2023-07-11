package com.muhammedkursatgokgun.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main(){
    myFunction()
}

suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}