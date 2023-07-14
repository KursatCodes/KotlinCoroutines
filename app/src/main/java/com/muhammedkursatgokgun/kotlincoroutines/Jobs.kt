package com.muhammedkursatgokgun.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        var myJob= launch {
            delay(2000)
            println("selam")
        }
        myJob.invokeOnCompletion {
            println("myJob end")
        }
        myJob.cancel()
    }
}