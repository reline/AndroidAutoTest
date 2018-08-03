package com.github.reline.androidautotest.injection.modules

import android.content.BroadcastReceiver
import com.github.reline.androidautotest.auto.CarMediaConnectionStatusReceiver
import com.github.reline.androidautotest.injection.components.CarMediaConnectionStatusReceiverSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.BroadcastReceiverKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [CarMediaConnectionStatusReceiverSubcomponent::class])
abstract class CarMediaConnectionStatusReceiverModule {
    @Binds
    @IntoMap
    @BroadcastReceiverKey(CarMediaConnectionStatusReceiver::class)
    abstract fun bindCarMediaConnectionStatusReceiverFactory(
            builder: CarMediaConnectionStatusReceiverSubcomponent.Builder
    ): AndroidInjector.Factory<out BroadcastReceiver>
}