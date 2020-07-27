package com.turastory.maplenote

import java.text.SimpleDateFormat
import java.util.*

object Version {

    private val timestamp = System.currentTimeMillis()
    private val dateFormat = SimpleDateFormat(
        "yyyyMMdd.HHmmss",
        Locale.getDefault(Locale.Category.FORMAT)
    )

    fun generateVersionCode(): Int = (timestamp / 1000L).toInt()

    fun versionCodeFormatter(isDevelopment: Boolean): (String) -> String = { version ->
        if (isDevelopment) {
            val time = dateFormat.format(timestamp)
            "$version+$time"
        } else {
            version
        }
    }
}
