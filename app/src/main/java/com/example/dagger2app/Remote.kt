package com.example.dagger2app

import android.util.Log
import javax.inject.Inject

/** To control the car remotely **/
class Remote @Inject constructor() {

    fun enableRemote(car: Car){
        Log.d(TAG, "Remote is connected")
    }
}