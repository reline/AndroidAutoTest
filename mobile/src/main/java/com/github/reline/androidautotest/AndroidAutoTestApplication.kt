package com.github.reline.androidautotest

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import com.github.reline.androidautotest.injection.components.DaggerApplicationComponent
import com.github.reline.androidautotest.injection.modules.ApplicationModule
import dagger.android.*
import javax.inject.Inject

class AndroidAutoTestApplication : Application(),
        HasActivityInjector, HasServiceInjector, HasBroadcastReceiverInjector
{

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingServiceInjector: DispatchingAndroidInjector<Service>

    @Inject
    lateinit var dispatchingBroadcastReceiverInjector: DispatchingAndroidInjector<BroadcastReceiver>

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
                .inject(this)
    }

    override fun activityInjector() = dispatchingActivityInjector

    override fun serviceInjector() = dispatchingServiceInjector

    override fun broadcastReceiverInjector() = dispatchingBroadcastReceiverInjector
}