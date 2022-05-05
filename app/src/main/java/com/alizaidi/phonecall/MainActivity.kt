package com.alizaidi.phonecall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alizaidi.call_state.PhoneCall

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PhoneCall(this,this)
    }
}