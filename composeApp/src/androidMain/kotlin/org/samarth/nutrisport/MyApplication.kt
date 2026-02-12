package org.samarth.nutrisport

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize
import com.nutrisport.di.initializeKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.koinApplication

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin(
            config = {
                koinApplication().androidContext(this@MyApplication)
            }
        )
        Firebase.initialize(this@MyApplication)
    }
}