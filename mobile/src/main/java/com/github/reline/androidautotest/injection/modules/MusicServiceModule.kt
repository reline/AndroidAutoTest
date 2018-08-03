package com.github.reline.androidautotest.injection.modules

import android.app.Service
import com.github.reline.androidautotest.MusicService
import com.github.reline.androidautotest.injection.components.MusicServiceSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ServiceKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MusicServiceSubcomponent::class])
abstract class MusicServiceModule {
    @Binds
    @IntoMap
    @ServiceKey(MusicService::class)
    abstract fun bindMusicServiceInjectorFactory(builder: MusicServiceSubcomponent.Builder): AndroidInjector.Factory<out Service>
}
