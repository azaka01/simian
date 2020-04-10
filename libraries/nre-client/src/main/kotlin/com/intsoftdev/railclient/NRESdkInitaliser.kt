package com.intsoftdev.railclient

import android.app.Application
import com.intsoftdev.railclient.di.DIComponent
import com.intsoftdev.railclient.di.Di

public class NRESDKInitialiser(private val application: Application) : DIComponent {
    fun initialise() {
        Di.init(application)
    }
}