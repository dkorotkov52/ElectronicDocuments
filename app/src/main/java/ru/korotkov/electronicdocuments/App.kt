package ru.korotkov.electronicdocuments

import android.content.ComponentName
import android.support.multidex.MultiDexApplication
import android.util.Log
import java.util.*
import kotlin.concurrent.scheduleAtFixedRate

class App: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        PrefManager.init(this)
    }
}