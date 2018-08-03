package com.github.reline.androidautotest.auto

import android.app.UiModeManager
import android.content.res.Configuration

class AndroidAutoCarModeDetector(private val uiModeManager: UiModeManager) : CarModeDetector {
    override fun isCarUiMode(): Boolean {
        return uiModeManager.currentModeType == Configuration.UI_MODE_TYPE_CAR
    }
}