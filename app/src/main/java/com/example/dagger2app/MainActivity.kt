package com.example.dagger2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject /** Field injection **/
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Creating Car object with Dagger through field injection.
         * Car component will be created by generated DaggerCarComponent
         **/
        val carComponent = DaggerCarComponent.create()

        /** carComponent.getCar() - constructor injection */

        /** Inject into this will inject all the fields we have at top with inject annotation */
        carComponent.inject(this)

        car.drive()
    }
}