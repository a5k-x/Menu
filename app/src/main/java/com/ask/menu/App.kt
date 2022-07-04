package com.ask.menu

import android.app.Application
import com.ask.menu.di.DaggerAppComponent

class App: Application() {

    val appComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}