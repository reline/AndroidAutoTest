package com.github.reline.androidautotest.injection.modules

import android.app.Application
import android.app.UiModeManager
import android.content.Context
import com.github.reline.androidautotest.auto.AndroidAutoCarModeDetector
import com.github.reline.androidautotest.auto.CarModeDetector
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideUiModeManager(context: Context): UiModeManager {
        return context.getSystemService(UiModeManager::class.java)
    }

    @Provides
    @Singleton
    fun provideCarModeDetector(uiModeManager: UiModeManager): CarModeDetector {
        return AndroidAutoCarModeDetector(uiModeManager)
    }

}
