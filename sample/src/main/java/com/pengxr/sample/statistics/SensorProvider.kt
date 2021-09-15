package com.pengxr.sample.statistics

import android.util.Log
import com.pengxr.easytask.core.ITrackProvider
import com.pengxr.easytask.core.TrackParams
import java.util.*
import kotlin.collections.HashMap

/**
 * Mock Sensor SDK.
 * <p>
 * Created by pengxr on 5/9/2021
 */
class SensorProvider : ITrackProvider() {

    companion object {
        const val TAG = "Sensor"
    }

    // Mock internal datas.
    private val data = HashMap<String, String?>()

    /**
     * Enable data statistics or not.
     */
    override var enabled = true

    /**
     * The tag of this provider.
     */
    override var name = TAG

    /**
     * Init the provider.
     */
    override fun onInit() {
        Log.d(TAG, "Init Sensor provider.")
    }

    /**
     * Do event track.
     */
    override fun onEvent(eventName: String, params: TrackParams) {
        Log.d(TAG, params.toString())

        registerSuperProperties()
    }

    private fun registerSuperProperties() {
        val params = TrackParams()
        params[EventConstants.LONGITUDE] = "113.9"
        params[EventConstants.LATITUDE] = 22.5
        params[EventConstants.CITY_ID] = "1"
        params[EventConstants.CITY_NAME] = "深圳市"
        params[EventConstants.DEVICE_ID] = UUID.randomUUID()
        for ((key, value) in params) {
            data[key] = value
        }
    }
}