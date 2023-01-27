package com.example.spectrumsimple

import android.app.Application
import com.facebook.spectrum.SpectrumSoLoader

@Suppress("unused")
class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SpectrumSoLoader.init(this)

        // try this variant if the Facebook SoLoader creates troubles for your release distribution
        // SpectrumSoLoader.init(this, SpectrumSoLoader.SystemSoLoaderImpl())
    }
}
