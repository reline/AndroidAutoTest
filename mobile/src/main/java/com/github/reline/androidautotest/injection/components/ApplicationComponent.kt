package com.github.reline.androidautotest.injection.components

import com.github.reline.androidautotest.AndroidAutoTestApplication
import com.github.reline.androidautotest.injection.modules.ApplicationModule
import com.github.reline.androidautotest.injection.modules.CarMediaConnectionStatusReceiverModule
import com.github.reline.androidautotest.injection.modules.MainActivityModule
import com.github.reline.androidautotest.injection.modules.MusicServiceModule
import dagger.Component

@Component(
        modules = [
            ApplicationModule::class, MainActivityModule::class,
            MusicServiceModule::class, CarMediaConnectionStatusReceiverModule::class
        ]
)
interface ApplicationComponent {
    fun inject(application: AndroidAutoTestApplication)
}