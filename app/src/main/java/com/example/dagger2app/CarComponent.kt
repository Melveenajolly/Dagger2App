package com.example.dagger2app

import dagger.Component

/** Component class for Car and it generate car object */
@Component
interface CarComponent {

    fun getCar(): Car //getCar requires Constructor Injection

    fun inject(mainActivity: MainActivity)
}