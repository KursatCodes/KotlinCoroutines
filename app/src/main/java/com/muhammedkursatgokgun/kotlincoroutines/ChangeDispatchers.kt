package com.muhammedkursatgokgun.kotlincoroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {

        launch(Dispatchers.Default){
            println(coroutineContext)
            withContext(Dispatchers.Unconfined){
                println(coroutineContext)
            }

        }
    }
}