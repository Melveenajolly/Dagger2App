package com.example.dagger2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Creating Car object with Dagger */
        val carComponent = DaggerCarComponent.create() /** car component will be created by generated DaggerCarComponent */
        val car: Car = carComponent.getCar()
        car.drive()
    }
}