package com.github.reline.androidautotest.injection.components

import com.github.reline.androidautotest.MusicService
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface MusicServiceSubcomponent : AndroidInjector<MusicService> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MusicService>()
}
