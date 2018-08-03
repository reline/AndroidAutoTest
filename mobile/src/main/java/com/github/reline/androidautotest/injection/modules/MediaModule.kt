package com.github.reline.androidautotest.injection.modules

import android.media.MediaPlayer
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MediaModule {

    @Provides
    @Singleton
    fun provideMediaPlayer(): MediaPlayer {
        return MediaPlayer()
    }
}