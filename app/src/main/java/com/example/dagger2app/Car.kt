package com.example.dagger2app

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheel: Wheel, val engine: Engine) { //Injecting dependency values for getCar

    //Logcat purpose
    companion object {
        private const val TAG = "DaggerCar"
    }

    fun drive(){
        Log.d(TAG,"I am driving")
    }
}