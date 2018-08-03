package com.github.reline.androidautotest.injection.components

import com.github.reline.androidautotest.auto.CarMediaConnectionStatusReceiver
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface CarMediaConnectionStatusReceiverSubcomponent : AndroidInjector<CarMediaConnectionStatusReceiver> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<CarMediaConnectionStatusReceiver>()
}