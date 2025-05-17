package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

fun constructUrl(path: String, apiKey: String = BuildConfig.API_KEY): String {
    val base = if (path.startsWith("/")) BuildConfig.BASE_URL + path.drop(1)
    else BuildConfig.BASE_URL + path
    return "$base?apiKey=$apiKey"
}
