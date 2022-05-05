package com.alizaidi.call_state

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class PhoneCall(val context:Context,val activity: Activity) {

    init {
        checkRequest()
    }

    private fun checkRequest() {
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE)
            != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity,
                arrayOf(Manifest.permission.READ_PHONE_STATE),1)
        }
    }
}