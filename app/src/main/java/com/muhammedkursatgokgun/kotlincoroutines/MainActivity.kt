package com.muhammedkursatgokgun.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*GlobalScope.launch {
            launch {
                println("1")
                delay(5000)
                println("2")
            }
        }

        runBlocking {
            launch {
                println("run start")
                delay(3000)
                println("runblocking")
            }
        }
        GlobalScope.launch {
            println("3")
        }*/
       /* println("start")
        CoroutineScope(Dispatchers.Default).launch{
            delay(5000)
            println("coroutineScope")
        }
        println("end")*/
        runBlocking {
            launch(Dispatchers.Main) {
                println("Manin Thread" + Thread.currentThread().name)
            }
            launch(Dispatchers.IO) {
                println("IO = "+ Thread.currentThread().name)
            }
            launch(Dispatchers.Default) {
                println("Default Thread" + Thread.currentThread().name)
            }
            launch(Dispatchers.Unconfined) {
                println("unconfined Thread   " + Thread.currentThread().name)
            }
        }

    }
}