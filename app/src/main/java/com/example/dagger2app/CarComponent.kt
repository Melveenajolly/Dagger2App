package com.example.dagger2app

import dagger.Component

/** Component will construct class with dependencies for you.
 * Component class for Car and it generates car object.
 **/
@Component
interface CarComponent {

    fun getCar(): Car //getCar requires Constructor Injection

    fun inject(mainActivity: MainActivity)
}