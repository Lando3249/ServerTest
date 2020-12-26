package com.example.servertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.Socket

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendMessageButton = button

        fun sendMessage() {
            val client = Socket("192.168.1.204", 10000)
            var clientMessage = "Hello Server"
            client.outputStream.write(clientMessage.toByteArray())
            client.close()
        }

        sendMessageButton.setOnClickListener {
            sendMessage()
        }
    }
    }


