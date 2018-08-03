package com.github.reline.androidautotest.auto

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import dagger.android.AndroidInjection

class CarMediaConnectionStatusReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        AndroidInjection.inject(this, context)
        if (intent.action != CAR_MEDIA_STATUS_ACTION) {
            return
        }

        val status = intent.getStringExtra("media_connection_status")
        val isConnectedToCar = "media_connected" == status

        // TODO: adjust settings based on the connection status
        Log.d(TAG, "connected = $isConnectedToCar")
    }

    companion object {
        const val TAG = "CarMediaConnectionStatus"
        const val CAR_MEDIA_STATUS_ACTION = "com.google.android.gms.car.media.STATUS"
        private val FILTER = IntentFilter(CAR_MEDIA_STATUS_ACTION)
    }
}