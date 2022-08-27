package com.example.dagger2app

import android.util.Log
import javax.inject.Inject

//Logcat purpose
const val TAG = "DaggerCar"

class Car @Inject constructor(val wheel: Wheel, val engine: Engine) { //Injecting dependency values for getCar

    fun drive() {
        Log.d(TAG, "I am driving")
    }

    @Inject /** Method injection **/
    fun connectRemote(remote: Remote){
        remote.enableRemote(this)
    }
}